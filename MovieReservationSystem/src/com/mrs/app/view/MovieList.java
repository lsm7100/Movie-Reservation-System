package com.mrs.app.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	JButton b1 = new JButton(new ImageIcon("./image/one.jpg"));
	JButton b2 = new JButton(new ImageIcon("./image/two.jpg"));
	JButton b3 = new JButton(new ImageIcon("./image/three.jpg"));
	JButton previous = new JButton(new ImageIcon("./image/button/reservation.png"));
	JButton movieList = new JButton(new ImageIcon("./image/button/Movielist.png"));
	JButton preView = new JButton(new ImageIcon("./image/button/pre.png"));

	JLabel lab1 = new JLabel("999명");
	JLabel lab2 = new JLabel("999명");
	JLabel lab3 = new JLabel("999명");

	public MovieList() {
		setTitle("MEGABIC_영화리스트");
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

		b1.setBounds(68, 128, 160, 230);
		b2.setBounds(347, 128, 160, 230);
		b3.setBounds(612, 128, 160, 230);

		lab1.setBounds(160, 376, 100, 15);
		lab2.setBounds(450, 376, 100, 15);
		lab3.setBounds(715, 376, 100, 15);

		lab1.setForeground(Color.WHITE);
		lab2.setForeground(Color.WHITE);
		lab3.setForeground(Color.WHITE);

		preView.setBounds(30, 200, 17, 39);
		

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showInnocenceInfo(main);
			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showAladinInfo(main);
			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showGreatestInfo(main);
			}
		});

		preView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showAccountInfo(main);
			}
		});

		add(b1);
		add(b2);
		add(b3);

		add(preView);

		add(lab1);
		add(lab2);
		add(lab3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
