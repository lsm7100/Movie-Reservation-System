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
		main.login = new Login(); // �α���â ���̱�
		main.login.setMain(main); // �α���â���� ���� Ŭ����������
	}

	public void showMovieList() {
		this.movieList = new MovieList(); // ��ȭ ��� â���� �̵�.
	}

	public void showMovieInfo() {
		this.movieInfo = new MovieInfo(); // ��ȭ ���� â���� �̵�.
	}
	
	public void showRegister() {
		this.register = new Register(); // ȸ�� ��� â���� �̵�.
	}


}
