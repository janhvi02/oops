package algorithms;

public class BubbleSort {
    public static void main(String[] args){
        int[] a ={9,19,49,79,59,29,99,69,39};
        int n=a.length;

        for(int i=0 ; i<n-1 ;i++){
            for(int j=0 ; j<n-1 ;j++){


                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int item:a){
            System.out.print(item+" ");
        }
    }
}

