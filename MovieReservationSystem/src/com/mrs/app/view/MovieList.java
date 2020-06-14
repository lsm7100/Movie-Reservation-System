package com.mrs.app.view;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mrs.app.Movie;

public class MovieList extends SuperView {

	private static final long serialVersionUID = -827322840616802900L;

	JButton b1 = new JButton(new ImageIcon("./image/one.jpg")); // 버튼에 이미지를 넣는다
	JButton b2 = new JButton(new ImageIcon("./image/two.jpg")); // 버튼에 이미지를 넣는다
	JButton b3 = new JButton(new ImageIcon("./image/three.jpg")); // 버튼에 이미지를 넣는다
	JLabel lab1 = new JLabel("999명");
	JLabel lab2 = new JLabel("999명");
	JLabel lab3 = new JLabel("999명");

	public MovieList() {
		setTitle("MEGABIC");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();
	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/movieList.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		b1.setBounds(64, 124, 160, 230);
		b2.setBounds(342, 124, 160, 230);
		b3.setBounds(606, 124, 160, 230);

		lab1.setBounds(160, 376, 100, 15);
		lab2.setBounds(450, 376, 100, 15);
		lab3.setBounds(715, 376, 100, 15);

		lab1.setForeground(Color.WHITE);
		lab2.setForeground(Color.WHITE);
		lab3.setForeground(Color.WHITE);

		add(b1);
		add(b2);
		add(b3);

		add(lab1);
		add(lab2);
		add(lab3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
