package com.mrs.app;

import javax.swing.JFrame;

import com.mrs.app.view.Login;
import com.mrs.app.view.MovieInfo;
import com.mrs.app.view.MovieList;
import com.mrs.app.view.Register;

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

	public void showMovieList(Movie main) {
		this.movieList = new MovieList(); // ��ȭ ��� â���� �̵�.
		this.movieList.setMain(main);
	}

	public void showMovieInfo(Movie main) {
		this.movieInfo = new MovieInfo(); // ��ȭ ���� â���� �̵�.
		this.movieInfo.setMain(main);
	}
	
	public void showRegister(Movie main) {
		this.register = new Register(); // ȸ�� ��� â���� �̵�.
		this.register.setMain(main);
	}
	
	public void showLogin(Movie main) {
		this.login = new Login();
		this.login.setMain(main);
	}

}
