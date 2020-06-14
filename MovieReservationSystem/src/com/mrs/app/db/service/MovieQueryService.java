package com.mrs.app.db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mrs.app.db.util.DbConnect;
import com.mrs.app.db.vo.MovieVO;

public class MovieQueryService {
	
	private ArrayList<MovieVO> getMovieInfoList() { // 다중 Movie행 
		ArrayList<MovieVO> vo = new ArrayList<MovieVO>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;		
		
		StringBuilder query = new StringBuilder();
		
		query.append(String.format("SELECT * FROM MOVIE"));
		
		try {
			conn = DbConnect.getConnection(); // DB Connection 가져오기
			stmt = conn.prepareStatement(query.toString()); // 실행 할 쿼리 입력
			rs = stmt.executeQuery(); // 쿼리의 결과를 ResultSet에 대입해준다.

			while(rs.next()) { // 조회된 값이 있다면 if문 안으로 실행이 된다.
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
	
	private MovieVO getMovieInfo(int mNum) { // 단일 Movie행  
		MovieVO vo = new MovieVO();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;		
		
		StringBuilder query = new StringBuilder();
		
		query.append(String.format("SELECT * FROM MOVIE WHERE MNUM = %d", mNum));
		
		try {
			conn = DbConnect.getConnection(); // DB Connection 가져오기
			stmt = conn.prepareStatement(query.toString()); // 실행 할 쿼리 입력
			rs = stmt.executeQuery(); // 쿼리의 결과를 ResultSet에 대입해준다.

			if(rs.next()) { // 조회된 값이 있다면 if문 안으로 실행이 된다.
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
