package com.study.security_kyunghan.service.notice;

import com.study.security_kyunghan.web.dto.notice.AddNoticeReqDto;
import com.study.security_kyunghan.web.dto.notice.GetNoticeResponseDto;

public interface NoticeService {
	
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception;
	public GetNoticeResponseDto getNotice(String flag, int noticeCode) throws Exception;
}