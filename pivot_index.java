import java.util.*;

public class pivot_index {
    public static int pivotIndex(int arr[], int n) {
        // using binary search
        int mid =n/2;
        int left=0; int right=0;
        
        for(int i=0; i<mid; i++){
            left+= arr[i];
        }
        for(int i=n-1; i>mid; i--){
            right+= arr[i];
        }
        if(right>left){
            while(right>left && mid<n-1){
                right-= arr[mid+1];
                left+= arr[mid];
                mid++;
            }
        }
        else{
            while(left>right && mid>0){
                left-= arr[mid-1];
                right+= arr[mid];
                mid--;
            }
        }
        if(left==right)
            return mid;
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,7,3,6,5,6};
        int n = arr.length;
        System.out.println("The index: "+pivotIndex(arr,n));
         
    }
}
