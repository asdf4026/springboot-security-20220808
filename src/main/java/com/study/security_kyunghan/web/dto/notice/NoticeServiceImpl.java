package com.study.security_kyunghan.web.dto.notice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeServiceImpl implements NoticeService{
	@Value("{file.path}")
	private String filePath;
	@Override
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception {
		
	String originalFilename = addNoticeReqDto.getFile().get(0).getOriginalFilename();
	
	if(originalFilename.isBlank()) {
		
	}else {
		String tempFilename = UUID.randomUUID().toString().replace("-", "") + "_" + originalFilename;
		log.info(tempFilename);
	}
	return 0;
		
	}

}
