package com.project.tests.RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = {"src/test/resources/features"}, 
glue = {"com.project.tests.Definitions"},
plugin = {})
public class RunnersTest extends AbstractTestNGCucumberTests{

}
