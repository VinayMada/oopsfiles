import java.util.*;
import java.lang.*;
class lsearch{
	public static void main(String a[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int key=sc.nextInt();
		int i;
		for( i=0;i<n;i++){
			if(arr[i]==key){
				System.out.println("Element found at:"+i);
				break;
			}
		}
		if(i==n){
			System.out.println("Element not found");
		}
	}
}
