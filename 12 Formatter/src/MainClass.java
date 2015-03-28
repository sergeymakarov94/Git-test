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
			System.out.println("Сколько вам лет?");
			String a = scn.next();
			System.out.println("Как вас зовут?");
			String b = scn.next();
			System.out.println("Где вы живете?");
			String c = scn.next();
			System.out.printf("Вам лет - %s \nВас зовут- %s \nВы из - %s \n",
					a, b, c);
			x.format("Вам лет - %s \nВас зовут- %s \nВы из - %s \n", a, b, c);
			x.close();
		} catch (FileNotFoundException e) {
		}
		;
	}
}
