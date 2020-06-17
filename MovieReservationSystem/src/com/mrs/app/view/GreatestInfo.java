package com.mrs.app.view;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class GreatestInfo extends SuperView {

	private static final long serialVersionUID = -7740443590532007754L;

	JButton preView = new JButton(new ImageIcon("./image/button/pre.png"));

	JRadioButton movieTime_1 = new JRadioButton("06.16 8:00");
	JRadioButton movieTime_2 = new JRadioButton("06.16 9:00");
	JRadioButton movieTime_3 = new JRadioButton("06.16 16:00");

	public GreatestInfo() {
		setTitle("MEGABIC_위대한 쇼맨");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		
		createwindows();

		preView.setBounds(30, 200, 17, 39);

		movieTime_1.setBounds(420, 260, 90, 30);
		movieTime_2.setBounds(420, 290, 90, 30);
		movieTime_3.setBounds(420, 320, 90, 30);
		movieTime_1.setBackground(Color.WHITE);
		movieTime_2.setBackground(Color.WHITE);
		movieTime_3.setBackground(Color.WHITE);

		ButtonGroup group = new ButtonGroup();

		group.add(movieTime_1);
		group.add(movieTime_2);
		group.add(movieTime_3);
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
				dispose();
				main.showMovieList(main);
			}
		});
		
		movieTime_1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"좌석 선택으로 넘어가시겠습니까?", "Confirm", 
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					movieTime_1.setText("다시 선택하세요.");
				} else if(result == JOptionPane.YES_OPTION) {
					dispose(); 
					main.showSheetSelection(main); 
				}
			}
		});
		
		movieTime_2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"좌석 선택으로 넘어가시겠습니까?", "Confirm", 
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					movieTime_1.setText("다시 선택하세요.");
				} else if(result == JOptionPane.YES_OPTION) {
					dispose(); 
					main.showSheetSelection(main); 
				}
			}
		});
		
		movieTime_3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = JOptionPane.showConfirmDialog(null, 
						"좌석 선택으로 넘어가시겠습니까?", "Confirm", 
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					movieTime_1.setText("다시 선택하세요.");
				} else if(result == JOptionPane.YES_OPTION) {
					dispose(); 
					main.showSheetSelection(main); 
				}
			}
		});

		add(preView);
		;

		add(movieTime_1);
		add(movieTime_2);
		add(movieTime_3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
