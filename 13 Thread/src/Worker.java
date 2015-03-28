import java.util.*;

public class Worker implements Runnable {

	int time;
	String name;
	Random r = new Random();

	public Worker(String name) {
		this.name = name;
		time = r.nextInt(999);
	}

	public void run() {
		System.out.printf("Поток %s сгенерировал число %d\n", name, time);
		try {
			Thread.sleep(time);
			// time = r.nextInt(999);
		} catch (Exception e) {
		}
		;
		System.out.printf("Поток %s проснулся и сгенерировал число %d\n", name,
				time);
	}
}
