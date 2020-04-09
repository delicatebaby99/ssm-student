package com.example.page;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Page {
	private int page;
	
	private int rows;
	
	private int offset;

	


	public int getOffset() {
		this.offset = (page -1)*rows;
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = (page -1)*rows;
	}
	
	
}
