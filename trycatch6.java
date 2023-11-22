class myownexception extends Exception{
	public myownexception(String s){
		super(s);
	}
}
class trycatch6{
	public static void main(String args[]){
		try{
			throw new myownexception("Throwed myownexception");
		}
		catch(myownexception e){
			System.out.println(e);
		}
	}
}
