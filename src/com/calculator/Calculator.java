package com.calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JTextArea textarea = new JTextArea(2, 10);

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();

	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonClear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();

	double number1, number2, result;
	int addc = 0, mulc = 0, divc = 0, subc = 0;

	public Calculator() {

		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Anant Shinde");

		 frame.setResizable(false);

		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.RED, 4);

		panel.add(textarea);
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLACK, 3);
		textarea.setBorder(tborder);
		Font font = new Font("arial", Font.BOLD, 33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);

		textarea.setPreferredSize(new Dimension(2, 10));
		textarea.setLineWrap(true);

		button1.setPreferredSize(new Dimension(100, 40));
		button1.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button1.JPEG"));

		button2.setPreferredSize(new Dimension(100, 40));
		button2.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button2.JPEG"));

		button3.setPreferredSize(new Dimension(100, 40));
		button3.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button3.JPEG"));

		button4.setPreferredSize(new Dimension(100, 40));
		button4.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button4.JPEG"));

		button5.setPreferredSize(new Dimension(100, 40));
		button5.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button5.JPEG"));

		button6.setPreferredSize(new Dimension(100, 40));
		button6.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button6.JPEG"));

		button7.setPreferredSize(new Dimension(100, 40));
		button7.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button7.JPEG"));

		button8.setPreferredSize(new Dimension(100, 40));
		button8.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button8.JPEG"));

		button9.setPreferredSize(new Dimension(100, 40));
		button9.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button9.JPEG"));

		button0.setPreferredSize(new Dimension(100, 40));
		button0.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\button0.JPEG"));

		buttondot.setPreferredSize(new Dimension(100, 40));
		buttondot.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttondot.JPEG"));

		buttonsub.setPreferredSize(new Dimension(100, 40));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttonsub.JPEG"));

		buttonmul.setPreferredSize(new Dimension(100, 40));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttonmul.JPEG"));

		buttondiv.setPreferredSize(new Dimension(100, 40));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttondiv.JPEG"));

		buttonadd.setPreferredSize(new Dimension(100, 40));
		buttonadd.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttonadd.JPEG"));

		buttonClear.setPreferredSize(new Dimension(100, 40));
		buttonClear.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttonclear.JPEG"));

		buttonequal.setPreferredSize(new Dimension(100, 40));
		buttonequal.setIcon(new ImageIcon("C:\\Users\\Anant\\OneDrive\\Desktop\\button\\buttonequal.JPEG"));

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttondot);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonadd);
		panel.add(buttonClear);
		panel.add(buttonequal);

		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonClear.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == buttonClear) {
			number1 = 0.0;
			number2 = 0.0;
			textarea.setText(" ");
		}
		if (source == button1) {
			textarea.append("1");
		}
		if (source == button2) {
			textarea.append("2");
		}
		if (source == button3) {
			textarea.append("3");
		}
		if (source == button4) {
			textarea.append("4");
		}
		if (source == button5) {
			textarea.append("5");
		}
		if (source == button6) {
			textarea.append("6");
		}
		if (source == button7) {
			textarea.append("7");
		}
		if (source == button8) {
			textarea.append("8");
		}
		if (source == button9) {
			textarea.append("9");
		}
		if (source == button0) {
			textarea.append("0");
		}
		if (source == buttondot) {
			textarea.append(".");
		}
		if (source == buttonadd) {
			number1 = number_reader();
			textarea.setText("+");
			addc = 1;
			divc = 0;
			mulc = 0;
			subc = 0;

		}
		if (source == buttondiv) {
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 0;
			mulc = 0;
			subc = 0;

		}
		if (source == buttonsub) {
			number1 = number_reader();
			textarea.setText("-");
			addc = 0;
			divc = 0;
			mulc = 0;
			subc = 1;

		}
		if (source == buttonmul) {
			number1 = number_reader();
			textarea.setText("*");
			addc = 0;
			divc = 0;
			mulc = 0;
			subc = 0;

		}
		if (source == buttonequal) {
			number2 = number_reader();
			if (addc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if (subc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if (mulc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if (divc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
		}

	}

	public double number_reader() {
		double num1;
		String s;
		s = textarea.getText();
		num1 = Double.valueOf(s);
		return num1;
	}

}
