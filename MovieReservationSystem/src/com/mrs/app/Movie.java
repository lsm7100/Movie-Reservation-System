package com.mrs.app;

import javax.swing.JFrame;

import com.mrs.app.view.Login;
import com.mrs.app.view.MovieInfo;
import com.mrs.app.view.MovieList;

public class Movie extends JFrame {
	Login login;
	MovieList movieList;
	MovieInfo movieInfo;

	public static void main(String[] args) {
		Movie main = new Movie();
		main.login = new Login(); // 로그인창 보이기
		main.login.setMain(main); // 로그인창에게 메인 클래스보내기
	}

	public void showMovieList() {
		login.dispose(); // 로그인 창 닫기
		this.movieList = new MovieList(); // 영화 목록 창으로 이동.
	}

	public void showMovieInfo() {
		movieList.dispose(); // 영화 목록 창 닫기
		this.movieInfo = new MovieInfo(); // 영화 정보 창으로 이동.
	}
	
}
