package com.arnab.framework.test.main;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.testng.annotations.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
glue = "com.arnab.framework.test.stepdefs")
public class AppTestRunner {

    @BeforeClass
    public static void before_class() {
        System.out.println("Beginning test execution");
    }

}


