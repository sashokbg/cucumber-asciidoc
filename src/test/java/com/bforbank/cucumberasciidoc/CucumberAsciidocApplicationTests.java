package com.bforbank.cucumberasciidoc;

import com.github.cukedoctor.Cukedoctor;
import com.github.cukedoctor.api.CukedoctorConverter;
import com.github.cukedoctor.api.DocumentAttributes;
import com.github.cukedoctor.api.model.Feature;
import com.github.cukedoctor.config.GlobalConfig;
import com.github.cukedoctor.parser.FeatureParser;
import com.github.cukedoctor.util.FileUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CucumberAsciidocApplicationTests {

	@Test
	public void shouldSaveDocumentationIntoDisk(){
		List<String> pathToCucumberJsonFiles = FileUtil.findJsonFiles("target/test-classes/json-output/");
		List<Feature> features = FeatureParser.parse(pathToCucumberJsonFiles);
		DocumentAttributes attrs = GlobalConfig.getInstance().getDocumentAttributes();
		attrs.toc("left").backend("html5")
				.docType("book")
				.icons("font").numbered(false)
				.sourceHighlighter("coderay")
				.docTitle("Documentation Title")
				.sectAnchors(true).sectLink(true);

		for(Feature feature: features) {
			CukedoctorConverter converter = Cukedoctor.instance(Collections.singletonList(feature), attrs);
			converter.setFilename("docs/" + feature.getName() + ".adoc");

			converter.saveDocumentation();
		}
	}
}
