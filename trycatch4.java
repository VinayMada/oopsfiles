class trycatch4{
	public static void main(String args[]){
		try{
			Class.forName("xyz");
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
}
