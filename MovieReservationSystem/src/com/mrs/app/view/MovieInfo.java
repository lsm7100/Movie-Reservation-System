package com.mrs.app.view;

import java.awt.Label;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mrs.app.Movie;

public class MovieInfo extends JFrame {
	
	private Movie main;

	JButton b1 = new JButton(new ImageIcon("./image/one.jpg")); // 버튼에 이미지를 넣는다
	JButton b2 = new JButton(new ImageIcon("./image/two.gif")); // 버튼에 이미지를 넣는다
	JButton b3 = new JButton(new ImageIcon("./image/tree.jpg")); // 버튼에 이미지를 넣는다

	public MovieInfo() {

		setTitle("MEGABIC");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);

	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/movieList.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		b1.setBounds(64, 125, 160, 230);
		b2.setBounds(342, 125, 160, 230);
		b3.setBounds(606, 125, 160, 230);

		add(b1);
		add(b2);
		add(b3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		MovieInfo main = new MovieInfo();
		main.createwindows();
	}
	
	// mainProcess와 연동
	public void setMain(Movie main) {
		this.main = main;
	}
}
