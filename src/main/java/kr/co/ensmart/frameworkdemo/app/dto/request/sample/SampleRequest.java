package kr.co.ensmart.frameworkdemo.app.dto.request.sample;

import kr.co.ensmart.frameworkdemo.app.dto.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SampleRequest extends BaseEntity {
	private Long id;
	private String name;
	private String description;
}
