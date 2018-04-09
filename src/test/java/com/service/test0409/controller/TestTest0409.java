package com.service.test0409.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest0409 {

        Test0409Delegate test0409Delegate = new Test0409Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test0409Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}