import javax.swing.*;
import java.awt.*;
import java.awt.*;

public class reader extends JFrame {
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a, b;
	
	public reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("��������");
		b2 = new JButton("���������");
		l1 = new JLabel("������� ������ �����");
		l2 = new JLabel("������� ������ �����");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(t1);
		add(l1);
		add(t2);
		add(l2);
		add(l3);
		add(l4);
		add(b2);
		add(b1);
	}

}
