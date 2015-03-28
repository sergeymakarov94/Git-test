package ru.element.networking;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Server implements Runnable {

	public static Socket connection;
	public static ObjectOutputStream output;
	public static ObjectInputStream input;
	public static ServerSocket server;

	public void run() {
		try {
			server = new ServerSocket(5678, 10);
			while (true) {
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				output.writeObject("�� �������� " + (String) input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {
		}
	}
}
