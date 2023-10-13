package kr.co.ensmart.frameworkdemo.app.service;

import java.util.List;

import kr.co.ensmart.frameworkdemo.app.dto.response.sample.SampleResponse;

public interface SampleService {
	public List<SampleResponse> getAllSamples();
	public SampleResponse getSample(Long id);
}
