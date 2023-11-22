class testingheriarchyoftrycatch{
	public static void main(String args[]){
		try{
			int num=9/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
	}
}
