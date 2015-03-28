class dick {
	public static void main(String args[]) {
		reader r = new reader();
		r.scan();
		r.i = count(r.i);
		r.k = count(r.k);
		r.scan(r.i, r.k);
	} 
	private static int count(int x) {
		x = x + 1;
		return x;
	}
}
