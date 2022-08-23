package com.study.security_kyunghan.service.notice;

import com.study.security_kyunghan.web.dto.notice.AddNoticeReqDto;

public interface NoticeService {
	public int addNotice(AddNoticeReqDto addNoticeReqDto) throws Exception;
}
