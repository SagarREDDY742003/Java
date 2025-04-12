class Sort{
 public static void main(String[] args){

  int[] arr = {10,20,3,40,5,6,70,8,9,1};
  int temp=0;

  for(int i=0; i<arr.length-1; i++){
   for(int j=i+1; j<arr.length; j++){
    if(arr[i]>arr[j]){
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
    }
   }
  }
  for(int i : arr){
   System.out.println(i+" ");
  }
 }
}