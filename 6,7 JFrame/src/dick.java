import javax.swing.JFrame;


public class dick {
	public static void main(String args[]){
		reader r = new reader("�������");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
