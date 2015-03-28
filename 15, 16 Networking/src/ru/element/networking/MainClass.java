package ru.element.networking;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainClass extends JFrame implements Runnable {
	public static Socket connection;
	public static ObjectOutputStream output;
	public static ObjectInputStream input;

	public MainClass(String name) {
		super(name);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		final JTextField t1 = new JTextField(10);
		final JButton b1 = new JButton("Send");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == b1) {
					sendData(t1.getText());
				}
			}
		});
		add(t1);
		add(b1);

	}

	public static void main(String[] args) {
		new Thread(new MainClass("Test")).start();
		new Thread(new Server()).start();
	}

	public void run() {
		try {
			while (true) {
				connection = new Socket(InetAddress.getByName("127.0.0.1"),
						5678);
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				JOptionPane
						.showMessageDialog(null, (String) input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {
		}
	}

	private static void sendData(Object obj) {
		try {
			output.flush();
			output.writeObject(obj);
		} catch (Exception e) {
		}
	}
}
