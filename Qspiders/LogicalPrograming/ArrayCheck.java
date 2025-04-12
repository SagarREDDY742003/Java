class ArrayCheck{
 public static void main(String[] args){
  int[] arr1 = {1,2,3,4};
  int[] arr2 = {1,2,3,5};
  if(arr1.length == arr2.length){
   int a=0;
   for(int i=0; i<arr1.length; i++){
     if(arr1[i] != arr2[i]){
       a = 1;
       break;
     }
   }
   if(a==0)
    System.out.println("arr1 and arr2 are identical");
   else
    System.out.println("arr1 and arr2 are not identical");
  
  }
  else
   System.out.println("arr1 and arr2 are not identical");
 }
}



















