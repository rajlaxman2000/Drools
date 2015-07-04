package com.rajesh.drools.springintegration.factory.nondrools;

import com.google.common.collect.ImmutableMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rajesh.drools.springintegration.enums.TypeEnum;
import com.rajesh.drools.springintegration.factory.ProcessingFactory;
import com.rajesh.drools.springintegration.model.Product;
import com.rajesh.drools.springintegration.service.nondrools.ElectronicProductProcessingService;
import com.rajesh.drools.springintegration.service.nondrools.MedicalProductProcessingService;
import com.rajesh.drools.springintegration.service.Processor;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mgrzejszczak
 * Date: 14.01.13
 */
@SuppressWarnings("rawtypes")
@Component("NoRulesProcessingFactory")
public class NoRulesProcessingFactory  implements ProcessingFactory<Processor, Product> {

	private static final Logger LOGGER = LoggerFactory.getLogger(NoRulesProcessingFactory.class);
	   
    private static final Map<TypeEnum, Processor> PROCESSOR_MAP = new ImmutableMap.Builder<TypeEnum, Processor>().
            put(TypeEnum.MEDICAL, new MedicalProductProcessingService()).
            put(TypeEnum.ELECTRONIC, new ElectronicProductProcessingService()).
            build();

    /**
     * By using the map we don't have any ifs
     * @param inputObject
     * @return
     */
    @Override
    public Processor createProcessingObject(Product inputObject) {
    	LOGGER.info("Creating processing object for Product ::"+inputObject.getProductName());
        return PROCESSOR_MAP.get(inputObject.getTypeEnum());
    }
}
