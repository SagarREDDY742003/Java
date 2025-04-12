import java.util.Arrays;
class ArrSwap{
 public static void main(String[] args){

  int[] arr = {0,1,0,1,1,0,1};
  int a = 0;
  int b = arr.length-1;

  while(a<b){
   if(arr[a]>arr[b]){
    int temp = arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
   }
   a++;
   b--;
  }
  System.out.println(Arrays.toString(arr));
 }
}