
public class NewSort {
	public static void sel(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int min_in=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_in]) {
					min_in=j;
				}
				
			}
			int temp=arr[min_in];
			arr[min_in]=arr[i];
			arr[i]=temp;
		}
		System.out.print("[");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={64,25,12,22,11};
sel(arr);
	}

}
