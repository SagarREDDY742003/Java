class LinearSearch{
 public static void main(String[] args){
  int[] arr = {1,2,3,4,5,6,7,8,9,10};
  int a = 6;
  for(int i=0; i<arr.length; i++){
   if(arr[i]==a){
    System.out.println(a+" is present in array at index "+i);
    break;
   }
  }
 }
}