
public class Sort {
	public void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public void mergeSort(int[]arr) {
		sort(arr,0,arr.length);
	}
	private void sort(int[]arr,int low,int high) {
		if(high-low<2) {
			return;
		}
		int mid = (low + high) /2;
		sort(arr,low,mid);
		sort(arr,mid,high);
		merge(arr,low,mid,high);
	}
	private void merge(int[]arr,int low,int mid,int high) {
		int[] temp = new int[high -low];
		int t = 0;
		int l = low;
		int h = mid;
		while(l < mid && h <high) {
			if(arr[l]<arr[h]) {
				temp[t++] = arr[l++];
			}else {
				temp[t++] = arr[h++];
			}
		}
		while(l < mid) {
			temp[t++] = arr[l++];
		}
		while(h<high) {
			temp[t++] = arr[h++];
		}
		for(int i = low;i<high;i++) {
			arr[i] = temp[i-low];
		}
	}
	public void heapSort(int arr[]) {
		heap(arr,arr.length);
	}
	private void heap(int arr[],int end) {
		
	}
	public void quickSort(int arr[]) {
		quick(arr,0,arr.length-1);
	}
	private void quick(int arr[],int start,int end) {
		int pivot =arr[(start+end)/2];
		int l = start;
		int r = end;
	    do{
            while(arr[l] < pivot) {
            	l++;
            }
            while(arr[r] > pivot) {
            	r--;	
            }
            if(l <= r){    
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }while (l <= r);
         if(start < r){
        	 quick(arr, start, r);
         }
        if(end > l) {
        	quick(arr, l, end);
        }
    
}
}