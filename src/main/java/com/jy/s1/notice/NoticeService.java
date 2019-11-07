package com.jy.s1.notice;

import java.util.List;

public class NoticeService {
	private NoticeDAO noticeDAO;
	private NoticeDTO noticeDTO;
	
	public NoticeService() {
		this.noticeDAO = new NoticeDAO();
	}
	
	public List<NoticeDTO> noticeList() throws Exception {
	List<NoticeDTO> ar =noticeDAO.noticeList();
	return ar;
		
	}
	public NoticeDTO noticeSelect(int num)throws Exception {
		NoticeDTO noticeDTO = noticeDAO.noticeSelect(num);
		return noticeDTO;
	}
		

}
