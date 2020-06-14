package com.mrs.app.view;

import javax.swing.JFrame;

import com.mrs.app.Movie;

public class SuperView extends JFrame{

	private static final long serialVersionUID = -1867172431447765760L;

	protected Movie main;
	
	public void setMain(Movie main) {
		this.main = main;
	}
}	
