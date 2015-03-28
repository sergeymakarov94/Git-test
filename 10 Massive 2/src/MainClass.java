public class MainClass {
	public static void main(String[] args) {
		int[][] m = new int[3][3];
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int row = 0; row < m2.length; row++) {
			for (int coll = 0; coll < m[row].length; coll++) {
				System.out.print(m2[row][coll] + "   ");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
				}
			}
			System.out.println();
		}
	}
}
