import javax.swing.JOptionPane;;

public class reader {
	int i,k;
	String n1, n2;
	public void scan(){
		n1 = JOptionPane.showInputDialog("������� ������ �����");
		n2 = JOptionPane.showInputDialog("������� ������ ����� �����");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
	}
	public void scan(int a, int b){
		JOptionPane.showMessageDialog(null, "������ ���� ������ ����� = "+a);
		JOptionPane.showMessageDialog(null, "������ ���� ������ ����� = "+b);
	}
}
