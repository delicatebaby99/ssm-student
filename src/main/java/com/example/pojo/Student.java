package com.example.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
	private Long id;
	private String sn;
	private Long clazzId;
	private String username;
	private String password;
	private String sex;
	private String photo;
	private String remark;

}
