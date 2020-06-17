package com.mrs.app;

import javax.swing.JFrame;

import com.mrs.app.view.AccountInfo;
import com.mrs.app.view.Login;
import com.mrs.app.view.AladdinInfo;
import com.mrs.app.view.FinalConfirmation;
import com.mrs.app.view.GreatestInfo;
import com.mrs.app.view.InnocenceInfo;
import com.mrs.app.view.MovieList;
import com.mrs.app.view.Payment;
import com.mrs.app.view.Register;
import com.mrs.app.view.SheetSelection;

public class Movie extends JFrame {

	private static final long serialVersionUID = -7894793477727567194L;

	Login login;
	MovieList movieList;
	AladdinInfo movieInfo;
	Register register;
	AccountInfo accountInfo;
	AladdinInfo aladinInfo;
	GreatestInfo greatestInfo;
	InnocenceInfo innocenceInfo; 
	SheetSelection seatSelection;
	Payment payment;
	FinalConfirmation finalConfirmation;
	

	public static void main(String[] args) {
		Movie main = new Movie();
		main.login = new Login(); //
		main.login.setMain(main); //
	}

	public void showMovieList(Movie main) {
		this.movieList = new MovieList(); 
		this.movieList.setMain(main);
	}


	public void showRegister(Movie main) {
		this.register = new Register(); 
		this.register.setMain(main);
	}

	public void showLogin(Movie main) {
		this.login = new Login();
		this.login.setMain(main);
	}

	public void showAccountInfo(Movie main) {
		this.accountInfo = new AccountInfo();
		this.accountInfo.setMain(main);

	}
	public void showInnocenceInfo(Movie main) {
		this.innocenceInfo = new InnocenceInfo(); 
		this.innocenceInfo.setMain(main);
		}


	public void showAladinInfo(Movie main) {
		this.aladinInfo = new AladdinInfo(); 
		this.aladinInfo.setMain(main);
	}
	public void showGreatestInfo(Movie main) {
		this.greatestInfo = new GreatestInfo(); 
		this.greatestInfo.setMain(main);
	}
	public void showSheetSelection(Movie main) {
		this.seatSelection = new SheetSelection(); 
		this.seatSelection.setMain(main);	
	}
	public void showPayment(Movie main) {
		this.payment = new Payment(); 
		this.payment.setMain(main);	
	}
	public void showFinalConfirmation(Movie main) {
		this.finalConfirmation = new FinalConfirmation(); 
		this.finalConfirmation.setMain(main);	
	}
}
