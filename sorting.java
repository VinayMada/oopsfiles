import java.util.*;
class sorting{
	void merge(int arr[],int start,int mid,int end){
		int[] b=new int[100];
		int low=start,high=mid+1,j=low;
		while(low<=mid&&high<=end){
			if(arr[low]<arr[high]) b[j++]=arr[low++];
			else b[j++]=arr[high++];
		}
		while(low<=mid) b[j++]=arr[low++];
		while(high<=end) b[j++]=arr[high++];
		for(int i=low;i<=high;i++) arr[i]=b[i];
		return;
	}
	void mergesort(int arr[],int start,int end){
		if(start>end)return;
		int mid=(start+end)/2;
		mergesort(arr,start,mid-1);
		mergesort(arr,mid,end);
		merge(arr,start,mid,end);		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sorting s=new sorting();
		int[] arr=new int[n];
		int i=0;
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int start=0,end=n-1;
		s.mergesort(arr,start,end);
		for(i=0;i<n;i++) System.out.print(arr[i]);
	}
}
