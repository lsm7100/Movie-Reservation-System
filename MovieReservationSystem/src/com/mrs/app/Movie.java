package com.mrs.app;

import javax.swing.JFrame;

import com.mrs.app.view.Login;
import com.mrs.app.view.MovieInfo;
import com.mrs.app.view.MovieList;

public class Movie extends JFrame {

	private static final long serialVersionUID = -7894793477727567194L;

	Login login;
	MovieList movieList;
	MovieInfo movieInfo;
	Register register;

	public static void main(String[] args) {
		Movie main = new Movie();
		main.login = new Login(); // 로그인창 보이기
		main.login.setMain(main); // 로그인창에게 메인 클래스보내기
	}

	public void showMovieList() {
		this.movieList = new MovieList(); // 영화 목록 창으로 이동.
	}

	public void showMovieInfo() {
		this.movieInfo = new MovieInfo(); // 영화 정보 창으로 이동.
	}
	
	public void showRegister() {
		this.register = new Register(); // 회원 등록 창으로 이동.
	}


}
