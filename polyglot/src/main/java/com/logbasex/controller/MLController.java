package com.logbasex.controller;

import com.logbasex.service.MachineLearningService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class MLController {
	private final MachineLearningService mlSv;
	
	/**
	 * curl --location --request POST 'http://localhost:8080/predict' \
	 * --header 'Content-Type: application/json' \
	 * --data-raw '[
	 *     12.5,
	 *     15.3,
	 *     22.8,
	 *     9.1,
	 *     17.6
	 * ]'
	 */
	@PostMapping("/predict")
	public double predict(@RequestBody double[] inputData) throws IOException {
		return mlSv.runModel(inputData);
	}
}
