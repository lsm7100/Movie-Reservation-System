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

public class SheetSelection extends SuperView {

	private static final long serialVersionUID = -7740443590532007754L;

	JButton preView = new JButton(new ImageIcon("./image/button/pre.png"));

	JButton seat_A1 = new JButton(new ImageIcon("./image/button/seatA1.png"));
	JButton seat_A2 = new JButton(new ImageIcon("./image/button/seatA2.png"));
	JButton seat_A3 = new JButton(new ImageIcon("./image/button/seatA3.png"));

	public SheetSelection() {
		setTitle("MEGABIC-좌석선택");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
	
		createwindows();
		preView.setBounds(30, 200, 17, 39);

		seat_A1.setBounds(196, 216, 78, 75);
		seat_A2.setBounds(426, 216, 78, 75);
		seat_A3.setBounds(648, 216, 78, 75);

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
				dispose();
				main.showMovieList(main);
			}
		});

		seat_A1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showPayment(main);
			}
		});

		seat_A2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showPayment(main);
			}
		});

		seat_A3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showPayment(main);
			}
		});

		add(preView);
		add(seat_A1);
		add(seat_A2);
		add(seat_A3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
