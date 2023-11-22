class trycatch3{
	static void two() throws Exception{
		throw new Exception("Throwed exception from method two");
	}
	 static void one() throws Exception{
		try{
			two();
		}
		catch(Exception e){
			System.out.println(e+"  Exception caught in method one()");
			throw new Exception("Throwed exception from method one");
		}
	}
	public static void main(String args[]){
		try{
			one();
		}
		catch(Exception e){
			System.out.println(e+"  Exception caught in main");
		}
	}
}
