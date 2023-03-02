package algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2,4,5,8,9,0};
        int n= arr.length;

        for(int i=0 ; i<n-1 ; i++){
            int minIndex =i;
            for(int j=i ;j<n-1 ;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=(minIndex);
            minIndex=temp;
        }
        for(int e:arr){
            System.out.print(e+" ,");
        }

     }
}
