import javax.swing.JOptionPane;;

public class reader {
	int i,k;
	String n1, n2;
	public void scan(){
		n1 = JOptionPane.showInputDialog("Введите первое число");
		n2 = JOptionPane.showInputDialog("Введите второе число число");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
	}
	public void scan(int a, int b){
		JOptionPane.showMessageDialog(null, "Теперь ваше первое число = "+a);
		JOptionPane.showMessageDialog(null, "Теперь ваше второе число = "+b);
	}
}
