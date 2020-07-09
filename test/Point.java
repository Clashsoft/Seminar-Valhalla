inline class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args)
	{
		Point p = new Point(1, 2);
		Point q = new Point(1, 2);
		System.out.println(p); // [Point x=1 y=2]
		System.out.println(p == p); // true
		System.out.println(p == q); // true (!)
		Object po = p;
		Object qo = q;
		System.out.println(po == qo); // true (!)

		int i = -10000;
		Object i1 = i;
		Object i2 = i;
		System.out.println(i1 == i2); // false :(
		int[] is = { 1, 2, 3 };
		// Object[] os = is; // error: int[] cannot be converted to Object[] :(
	}
}
