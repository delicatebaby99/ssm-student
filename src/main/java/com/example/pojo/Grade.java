package com.example.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Grade {
	private Long id;
	private String name;
	private String remark;

}
