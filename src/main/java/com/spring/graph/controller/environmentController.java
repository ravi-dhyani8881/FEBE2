package com.spring.graph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.spring.graph.utils.QueryUtils;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import com.spring.graph.QueryResolver.environmentResponseTemplate;
import com.spring.graph.QueryResolver.GenericQueryResolver;
import com.spring.graph.Model.Recordsenvironment;
import com.spring.graph.QueryResolver.subOrganizationResponseTemplate;
import com.spring.graph.QueryResolver.organizationResponseTemplate;
import com.spring.graph.QueryResolver.publishGraphResponseTemplate;
import com.spring.graph.QueryResolver.publishRestResponseTemplate;

@Controller
public class environmentController {

	@Autowired
	GenericQueryResolver genericQueryResolver;
	
	@QueryMapping
    public environmentResponseTemplate findenvironmentByQuery(@Argument String query, @Argument String start,@Argument String rows, @Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field ) {
		return  genericQueryResolver.findenvironmentByQuery(query, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);	
    }	  
			@SchemaMapping
			public subOrganizationResponseTemplate findsubOrganizationByQuery(Recordsenvironment content, @Argument String query, @Argument String start,@Argument String rows,
    												@Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field) throws Exception {
		String query2=QueryUtils.replaceTokens(query, content);	
		return genericQueryResolver.findsubOrganizationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
    }
			@SchemaMapping
			public organizationResponseTemplate findorganizationByQuery(Recordsenvironment content, @Argument String query, @Argument String start,@Argument String rows,
    												@Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field) throws Exception {
		String query2=QueryUtils.replaceTokens(query, content);	
		return genericQueryResolver.findorganizationByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
    }
			@SchemaMapping
			public publishGraphResponseTemplate findpublishGraphByQuery(Recordsenvironment content, @Argument String query, @Argument String start,@Argument String rows,
    												@Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field) throws Exception {
		String query2=QueryUtils.replaceTokens(query, content);	
		return genericQueryResolver.findpublishGraphByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
    }
			@SchemaMapping
			public publishRestResponseTemplate findpublishRestByQuery(Recordsenvironment content, @Argument String query, @Argument String start,@Argument String rows,
    												@Argument String filterField, @Argument String filterQuery,
    							  @Argument String sort,@Argument String advanceField,@Argument String advanceQuery,@Argument String advance,@Argument String field) throws Exception {
		String query2=QueryUtils.replaceTokens(query, content);	
		return genericQueryResolver.findpublishRestByQuery(query2, start, rows, filterField, filterQuery, sort, advanceField, advanceQuery, advance, field);
    }
}