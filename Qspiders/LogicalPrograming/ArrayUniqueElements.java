import java.util.Arrays;
class ArrayUniqueElements{
 public static void main(String[] args){
  int[] arr = {11,12,13,11,12,15,11,17};
  System.out.println(Arrays.toString(arr));
  System.out.println("Unique elements are:");
  for(int i=0;i<arr.length;i++){
   boolean s = true;
   for(int j=0;j<arr.length;j++){
    if(i==j){
     continue;
    }
    else{
     if(arr[i] == arr[j]){
      s = false;
     }
    }
   }
   if(s)
    System.out.println(arr[i]);
  }
 }
}