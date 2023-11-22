class trycatch5{
	public static void main(String args[]){
		try{
			Integer.parseInt("Q");
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}
