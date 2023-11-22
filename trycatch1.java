 import java.util.*;
 class trycatch1{
 	public static void main(String args[]){
 		try{
 			throw new Exception("throwed a exception");
 		}
 		catch(Exception e){
 			System.out.println(e);
 		}
 		finally{
 			System.out.println("IN finally block");
 		}
 	}
 }
