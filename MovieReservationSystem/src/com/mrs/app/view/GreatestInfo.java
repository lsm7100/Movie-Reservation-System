package com.mrs.app.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GreatestInfo extends SuperView {

	private static final long serialVersionUID = -7740443590532007754L;

	JButton preView = new JButton(new ImageIcon("./image/button/previous.png"));
	JButton nextView = new JButton(new ImageIcon("./image/button/nextButton.png"));

	public GreatestInfo() {
		setTitle("MEGABIC");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();

		preView.setBounds(90, 370, 90, 35);
		nextView.setBounds(700, 370, 90, 35);
	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/greatWindow.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		preView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 기존 화면 꺼짐
				main.showMovieList(main); // 버튼을 누르면 Register로 넘어감
			}
		});

		nextView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 기존 화면 꺼짐
				main.showSeatSelection(main); // 버튼을 누르면 Register로 넘어감
			}
		});

		add(preView);
		add(nextView);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

//	public static void main(String[] args) {
//
//		MovieInfo main = new MovieInfo();
//		main.createwindows();
//	}
//
}
