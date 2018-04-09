package com.service.test0409.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-09T09:36:26.047Z")

@RestSchema(schemaId = "test0409")
@RequestMapping(path = "/test0409", produces = MediaType.APPLICATION_JSON)
public class Test0409Impl {

    @Autowired
    private Test0409Delegate userTest0409Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest0409Delegate.helloworld(name);
    }

}
