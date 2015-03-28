import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;

public class MainClass {
	static String[][] m = new String[5][3];
	static Scanner scn;

	public static void main(String[] args) {
		openfile();
		readfile();
		out();
	}

	private static void out() {
		for (int row = 0; row < m.length; row++) {
			for (int coll = 0; coll < m[row].length; coll++) {
				System.out.print(m[row][coll] + "   ");
			}
			System.out.println();
		}
	}

	private static void readfile() {
		while (scn.hasNext()) {
			for (int row = 0; row < m.length; row++) {
				for (int coll = 0; coll < m[row].length; coll++) {
					m[row][coll] = scn.next();
				}
			}
		}
	}

	private static void openfile() {
		try {
			scn = new Scanner(new File("res//1.txt"));
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Can't find file");
		}
	}
}
