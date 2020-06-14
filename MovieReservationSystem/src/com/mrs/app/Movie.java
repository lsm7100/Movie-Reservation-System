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
		main.login = new Login(); // �α���â ���̱�
		main.login.setMain(main); // �α���â���� ���� Ŭ����������
	}

	public void showMovieList() {
		login.dispose(); // �α��� â �ݱ�
		this.movieList = new MovieList(); // ��ȭ ��� â���� �̵�.
	}

	public void showMovieInfo() {
		movieList.dispose(); // ��ȭ ��� â �ݱ�
		this.movieInfo = new MovieInfo(); // ��ȭ ���� â���� �̵�.
	}
	
}
