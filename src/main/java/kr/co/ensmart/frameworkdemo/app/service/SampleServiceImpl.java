package kr.co.ensmart.frameworkdemo.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kr.co.ensmart.frameworkdemo.app.dto.response.sample.SampleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Lazy
@Slf4j
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {
	
	@Override
	public List<SampleResponse> getAllSamples() {
		List<SampleResponse> sampleList = new ArrayList<>();
		sampleList.add(SampleResponse.builder().id(1L).name("테스트명1").description("테스트설명 1").build());
		sampleList.add(SampleResponse.builder().id(1L).name("테스트명2").description("테스트설명 2").build());
		return sampleList;
	}

	@Override
	public SampleResponse getSample(Long id) {
		return SampleResponse.builder().id(1L).name("테스트명1").description("테스트설명 1").build();
	}

}
