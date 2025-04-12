import java.util.Arrays;
class TwoSum{
 public static void main(String[] args){
  int[] arr = {11,9,15,2,7,0};
  int[] a = new int[2]; 
  System.out.println(Arrays.toString(arr));
  int t = 9;
  for(int i=0;i<arr.length-1;i++){
   for(int j=i+1; j<arr.length;j++){
    if(arr[i] + arr[j] == t){
     a[0]=i;
     a[1]=j;
     System.out.println(Arrays.toString(a));
    }    
   }
  }
 }	
}