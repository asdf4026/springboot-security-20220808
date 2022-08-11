package com.study.security_kyunghan.handler.exception;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
@Getter
public class CustomValidationApiExcetion extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errorMap;
	
	public CustomValidationApiExcetion() {
		this("error", new HashMap<String, String>());
	}
	public CustomValidationApiExcetion(String message) {
		this(message, new HashMap<String, String>());
	}
	
	public CustomValidationApiExcetion(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
}
