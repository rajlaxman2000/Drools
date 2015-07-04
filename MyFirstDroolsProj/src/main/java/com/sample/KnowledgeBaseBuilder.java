package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;

public class KnowledgeBaseBuilder {
	
	public  static KnowledgeBase readKnowledgeBase	() throws Exception {
	    
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
	    kbuilder.add(ResourceFactory.newClassPathResource("Chicago.drl"), ResourceType.DRL);
	    kbuilder.add(ResourceFactory.newClassPathResource("Boston.drl"), ResourceType.DRL);
	    kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
	    KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
		for (KnowledgeBuilderError error: errors) {
		    System.err.println(error);
		}
		    throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		
		return kbase;
	}
}
