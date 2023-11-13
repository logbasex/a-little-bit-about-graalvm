package com.logbasex.service;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class MachineLearningService {
	public double runModel(double[] inputData) throws IOException {
		
		Path tempDir = Files.createTempDirectory("pythonScripts");
		try (InputStream is = getClass().getClassLoader().getResourceAsStream("python/model.py")) {
			if (is != null) {
				Files.copy(is, tempDir.resolve("model.py"));
			}
		}
		
		try (Context context = Context
				.newBuilder()
				.allowNativeAccess(true)
				.allowAllAccess(true)
				.build()) {
			// Load the Python script
			context.eval("python", "import sys");
			context.eval("python", "sys.path.append('" + tempDir.toAbsolutePath() + "')");
			
			// Convert Java array to a polyglot (Python) list
			Value pyInputData = context.eval("python", "[]");
			for (double data : inputData) {
				pyInputData.getMember("append").execute(data);
			}
			
			// Run the Python model's predict function
			context.eval("python", "import numpy");
			context.eval("python", "import model");
			Value pyFunction = context.eval("python", "model.predict");
			Value result = pyFunction.execute(pyInputData);
			
			// Return the result as a Java double
			return result.asDouble();
		}
	}
}
