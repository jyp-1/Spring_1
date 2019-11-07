package com.jy.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;



@Repository
public class NoticeDAO {
		
		@Inject
		private DataSource dataSource;
	
	
	// List

	public List<NoticeDTO> noticeList() throws Exception {
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		Connection con = dataSource.getConnection();
		String sql = "select * from notice order by num desc";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			/* noticeDTO.setContents(rs.getString("contents")); */
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
			ar.add(noticeDTO);
		}

		rs.close();
		st.close();
		con.close();
		return ar;

	}
	
	//select
	public NoticeDTO noticeSelect(int num)throws Exception{
		NoticeDTO noticeDTO = null;
		Connection con = dataSource.getConnection();
		String sql = "select * from notice where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, num);
		
		ResultSet rs = st.executeQuery();
			noticeDTO = new NoticeDTO();
		if(rs.next()) {
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
		}
		
		rs.close();
		st.close();
		return noticeDTO;
		
	}

	
	
	//write
	public void noticeWrite() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		Connection con = dataSource.getConnection();
		String sql ="insert into notice value board_seq.nextval,?,?,?,sysdate,0";
		PreparedStatement st = con.prepareStatement(sql);
	}
}
