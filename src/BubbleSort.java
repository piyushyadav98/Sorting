
public class BubbleSort {
	public static void bub(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.print("[");
		for(int n=0;n<arr.length;n++) {
			System.out.print(arr[n]+" ");
		}System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,1,4,2,8};
bub(arr);
	}

}