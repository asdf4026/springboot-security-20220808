package com.study.security_kyunghan.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.study.security_kyunghan.handler.exception.CustomValidationApiExcetion;
import com.study.security_kyunghan.web.dto.CMRespDto;


@RestController
@ControllerAdvice
public class RestControllerExceptionHandler {
	
	@ExceptionHandler(CustomValidationApiExcetion.class)
	public ResponseEntity<?> validationApiException(CustomValidationApiExcetion e) {
		return ResponseEntity.badRequest().body(new CMRespDto<>(-1, e.getMessage() , e.getErrorMap()));
	}
	
}
