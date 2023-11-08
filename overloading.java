class methods {
	static int Multiply(int a, int b)
	{
		return a * b;
	}
	static int Multiply(int a, int b, int c)
	{
		return a * b * c;
	}
}
class overloading{
	public static void main(String[] args)
	{
		System.out.println(methods.Multiply(2, 4));
		System.out.println(methods.Multiply(2, 7, 3));
	}
}

