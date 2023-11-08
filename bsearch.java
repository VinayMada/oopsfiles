import java.util.*;
import java.lang.*;
class bsearch{
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
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int left=0,right=n-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==key){
				System.out.println("Element is found");
				break;
			}
			if(arr[mid]<key){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		if(left>right){
			System.out.println("Element not found");
		}
	}
}
