import java.util.Arrays;
class ArrayValueOccurance{
 public static void main(String[] args){

  int[] a = {1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};

  System.out.println(Arrays.toString(a));

  for(int i=0; i<a.length;i++){
    int c = 1;
    for(int j=i+1;j<a.length;j++){
      if(a[i]==a[j]){
       a[j]=Integer.MAX_VALUE;
       c++;
      }
    }
    if(a[i] != Integer.MAX_VALUE){
       System.out.println(a[i]+" : "+c);
      }
  }

 }
}