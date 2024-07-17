package kr.co.ensmart.frameworkdemo.app.dto.response.sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SampleResponse {
	private Long id;
	private String name;
	private String nameMasking;
	private String description;
}
