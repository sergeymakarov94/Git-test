public class MainClass {
	public static void main(String[] args) {
		int[] m = new int[5];
		for (int x = 0; x < 5; x++) {
			m[x] = x;
			System.out.println(m[x] - 2 * m[x]);
		}
	}
}
