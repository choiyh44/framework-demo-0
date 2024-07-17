package kr.co.ensmart.frameworkdemo.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ensmart.frameworkdemo.app.dto.response.sample.Response;
import kr.co.ensmart.frameworkdemo.app.dto.response.sample.SampleResponse;
import kr.co.ensmart.frameworkdemo.app.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/samples")
@Slf4j
@RequiredArgsConstructor
public class SampleApiController {
	private final SampleService sampleService;

	@GetMapping("")
	public Response<List<SampleResponse>> getAllSamples() {
		return Response.<List<SampleResponse>>builder().payload(sampleService.getAllSamples()).build();
	}

	@GetMapping("/{id}")
	public Response<SampleResponse> getSample(@PathVariable Long id,
			@RequestHeader(value="test-header-key1", required = false) String testHeader1) {
		log.info("id: {}, testHeader1: {}", id, testHeader1);
		return Response.<SampleResponse>builder().payload(sampleService.getSample(id)).build();
	}

}
