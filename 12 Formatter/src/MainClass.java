import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class MainClass {

	static Formatter x;
	static Scanner scn;

	public static void main(String[] args) {
		try {
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("������� ��� ���?");
			String a = scn.next();
			System.out.println("��� ��� �����?");
			String b = scn.next();
			System.out.println("��� �� ������?");
			String c = scn.next();
			System.out.printf("��� ��� - %s \n��� �����- %s \n�� �� - %s \n",
					a, b, c);
			x.format("��� ��� - %s \n��� �����- %s \n�� �� - %s \n", a, b, c);
			x.close();
		} catch (FileNotFoundException e) {
		}
		;
	}
}
