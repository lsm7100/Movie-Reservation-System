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

public class SeatSelection extends SuperView {

	private static final long serialVersionUID = -7740443590532007754L;

	JButton preView = new JButton(new ImageIcon("./image/button/previous.png"));
	JButton nextView = new JButton(new ImageIcon("./image/button/nextButton.png"));
	
	JButton seat_A1 = new JButton(new ImageIcon("./image/button/seatA1.png"));
	JButton seat_A2 = new JButton(new ImageIcon("./image/button/seatA2.png"));
	JButton seat_A3= new JButton(new ImageIcon("./image/button/seatA3.png"));
	

	public SeatSelection() {
		setTitle("MEGABIC");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();

		preView.setBounds(90, 370, 90, 35);
		nextView.setBounds(700, 370, 90, 35);
	
		seat_A1.setBounds(194, 215, 78, 75);
		seat_A2.setBounds(425, 215, 78, 75);
		seat_A3.setBounds(649, 214, 78, 75);
	
	}
	

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/seatSelection.png")))));
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
				main.showPayment(main); // 버튼을 누르면 Register로 넘어감
			}
		});

		add(preView);
		add(nextView);
		add(seat_A1);
		add(seat_A2);
		add(seat_A3);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

//	public static void main(String[] args) {
//
//		SeatSelection main = new SeatSelection();
//		main.createwindows();
//	}

}
