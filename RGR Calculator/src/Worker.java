import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Worker extends JFrame {
	int i;
	float v1, v2, otvetss, otvet;
	char v4;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, brav, bpl, bmin, bum, bdel,	bo, bt, boo, bk, bpm;
	JTextField t1;
	String operation, numS = "0", otvets,  v3, v5;
	eHandler handler = new eHandler();

	public Worker(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		brav = new JButton("=");
		bpl = new JButton("+");
		bmin = new JButton("-");
		bum = new JButton("*");
		bdel = new JButton("/");
		bo = new JButton("C");
		bt = new JButton(".");
		boo = new JButton("c");
		bk = new JButton("√");
		bpm = new JButton("+-");
		t1 = new JTextField(16);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(bpl);
		add(b4);
		add(b5);
		add(b6);
		add(bmin);
		add(b7);
		add(b8);
		add(b9);
		add(bum);
		add(boo);
		add(b0);
		add(bpm);
		add(bdel);
		add(bo);
		add(bt);
		add(bk);
		add(brav);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b0.addActionListener(handler);
		bpl.addActionListener(handler);
		bmin.addActionListener(handler);
		bum.addActionListener(handler);
		bdel.addActionListener(handler);
		bo.addActionListener(handler);
		brav.addActionListener(handler);
		bt.addActionListener(handler);
		boo.addActionListener(handler);
		bk.addActionListener(handler);
		bpm.addActionListener(handler);
	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == b1) {
					t1.setText(t1.getText() + "1");

				}
				if (e.getSource() == b2) {
					t1.setText(t1.getText() + "2");
				}
				if (e.getSource() == b3) {
					t1.setText(t1.getText() + "3");
				}
				if (e.getSource() == b4) {
					t1.setText(t1.getText() + "4");
				}
				if (e.getSource() == b5) {
					t1.setText(t1.getText() + "5");
				}
				if (e.getSource() == b6) {
					t1.setText(t1.getText() + "6");
				}
				if (e.getSource() == b7) {
					t1.setText(t1.getText() + "7");
				}
				if (e.getSource() == b8) {
					t1.setText(t1.getText() + "8");
				}
				if (e.getSource() == b9) {
					t1.setText(t1.getText() + "9");

				}
				if (e.getSource() == b0) {
					t1.setText(t1.getText() + "0");
				}
				if (e.getSource() == bt) {
					t1.setText(t1.getText() + ".");
				}
				if (e.getSource() == bpm) {
					t1.setText( "-" +t1.getText());
				}
				if (e.getSource() == bk) {
					v1 = Float.valueOf(t1.getText());
					v3 = Float.toString(v1);
					v4 = v3.charAt(0);
					v5 = String.valueOf(v4);
					if (v5.equals("-")) {
						JOptionPane.showMessageDialog(null,	"We can't take sqrt from number with '-'");
					} else	{
						v1 = (float) v1;
						otvet = (float) Math.sqrt(v1);
						otvets = Float.toString(otvet);
						t1.setText(otvets);
					}
				}
				if (e.getSource() == bpl) {
					v1 = Float.valueOf(t1.getText());
					t1.setText("");
					operation = "+";
				}
				if (e.getSource() == bmin) {
					v1 = Float.valueOf(t1.getText());
					t1.setText("");
					operation = "-";
				}
				if (e.getSource() == bum) {
					v1 = Float.valueOf(t1.getText());
					t1.setText("");
					operation = "*";
				}
				if (e.getSource() == bdel) {
					v1 = Float.valueOf(t1.getText());
					t1.setText("");
					operation = "/";
				}
				if (e.getSource() == brav) {
					v2 = Float.valueOf(t1.getText());
					if ("+".equals(operation)) {
						otvet = v1 + v2;
						otvets = Float.toString(otvet);
						t1.setText(otvets);
					}
					if ("-".equals(operation)) {
						otvet = v1 - v2;
						otvets = Float.toString(otvet);
						t1.setText(otvets);
					}
					if ("*".equals(operation)) {
						otvet = v1 * v2;
						otvets = Float.toString(otvet);
						t1.setText(otvets);
					}
					if ("/".equals(operation)) {
						otvetss = (float) v1 / v2;
						otvets = Float.toString(otvetss);
						t1.setText(otvets);
					}
				}
				if (e.getSource() == bo) {
					t1.setText("");
					v1 = 0;
					v2 = 0;
					otvet = 0;
					otvets = "";

				}
				if (e.getSource() == boo) {
					t1.setText("");
					v2 = 0;
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,	"Please, enter correct number!");
			}
		}
	} 
}
