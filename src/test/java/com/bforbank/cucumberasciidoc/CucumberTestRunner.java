package com.bforbank.cucumberasciidoc;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:/features",
        plugin = {"json:target/test-classes/json-output/cucumber.json"} )
public class CucumberTestRunner {
}
