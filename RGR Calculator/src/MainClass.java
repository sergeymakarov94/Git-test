import javax.swing.JFrame;

public class MainClass {
	public static void main(String args[]) {
		Worker w = new Worker("Calculator");
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(200, 200);
		w.setLocationRelativeTo(null);
		w.setResizable(false);
	}
}