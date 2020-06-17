package com.mrs.app.db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mrs.app.db.util.DbConnect;
import com.mrs.app.db.vo.MovieVO;
import com.mrs.app.db.vo.User_IdVO;

public class MovieQueryService {
	
	private ArrayList<MovieVO> getMovieInfoList() { // ���� Movie�� 
		ArrayList<MovieVO> vo = new ArrayList<MovieVO>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;		
		
		StringBuilder query = new StringBuilder();
		
		query.append(String.format("SELECT * FROM MOVIE"));
		
		try {
			conn = DbConnect.getConnection(); // DB Connection ��������
			stmt = conn.prepareStatement(query.toString()); // ���� �� ���� �Է�
			rs = stmt.executeQuery(); // ������ ����� ResultSet�� �������ش�.

			while(rs.next()) { // ��ȸ�� ���� �ִٸ� if�� ������ ������ �ȴ�.
				MovieVO tempVO = new MovieVO();
				tempVO.setmNum(rs.getInt(1)); // mNum
				tempVO.setmName(rs.getString(2)); // mName
				tempVO.setmDate(rs.getDate(3)); // mDate
				tempVO.setmPrice(rs.getInt(4)); // mPrice
				tempVO.setmSeat(rs.getInt(5)); // mSeat
				
				vo.add(tempVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		return vo;
	}

	
	private User_IdVO getUserInfo(?,?) { // ���� Movie��  
		MovieVO vo = new MovieVO();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;		
		
		StringBuilder query = new StringBuilder();
		
		query.append(String.format("SELECT * FROM MOVIE WHERE MNUM = %d", mNum));
		
		try {
			conn = DbConnect.getConnection(); // DB Connection ��������
			stmt = conn.prepareStatement(query.toString()); // ���� �� ���� �Է�
			rs = stmt.executeQuery(); // ������ ����� ResultSet�� �������ش�.

			if(rs.next()) { // ��ȸ�� ���� �ִٸ� if�� ������ ������ �ȴ�.
				vo.setmNum(rs.getInt(1)); // mNum
				vo.setmName(rs.getString(2)); // mName
				vo.setmDate(rs.getDate(3)); // mDate
				vo.setmPrice(rs.getInt(4)); // mPrice
				vo.setmSeat(rs.getInt(5)); // mSeat
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			if(conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		return vo;
	}
}
