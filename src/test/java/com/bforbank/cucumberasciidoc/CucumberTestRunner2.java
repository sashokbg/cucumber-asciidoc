package com.bforbank.cucumberasciidoc;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:/features/feat2",
        plugin = {"json:target/test-classes/json-output/cucumber2.json"} )
public class CucumberTestRunner2 {
}
