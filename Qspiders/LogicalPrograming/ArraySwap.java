import java.util.Arrays;
class ArraySwap{
 public static void main(String[] args){

  int[] arr = {10,20,3,40,5,6,70,8,9,1};
  int a = 0;
  int b = arr.length-1;

  while(a<b){
   int temp = arr[a];
   arr[a]=arr[b];
   arr[b]=temp;
   a++;
   b--;
  }
  System.out.println(Arrays.toString(arr));
 }
}