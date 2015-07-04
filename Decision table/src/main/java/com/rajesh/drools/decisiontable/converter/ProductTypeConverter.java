package com.rajesh.drools.decisiontable.converter;

import org.apache.camel.Converter;
import org.drools.command.Command;
import org.drools.command.CommandFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rajesh.drools.decisiontable.model.Product;

import java.util.List;


/**
 * @author T9739
 *
 */
@Converter
public class ProductTypeConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductTypeConverter.class);

    @SuppressWarnings("rawtypes")
	@Converter
    public static Command toCommandFromList(List inputList) {
        LOGGER.debug("Executing ProductTypeConverter's toCommandFromList method");
        return CommandFactory.newInsertElements(inputList);
    }

    @SuppressWarnings("rawtypes")
	@Converter
    public static Command toCommand(Product product) {
        LOGGER.debug("Executing ProductTypeConverter's toCommand method");
        return CommandFactory.newInsert(product);
    }
}
