import java.util.Arrays;
class RevNumArray{
 public static void main(String[] args){
  int[] a = {123,456,789};
  for(int i=0; i<a.length;i++){
   int b = a[i];
   int temp = 0;
   while(b>0){
    int r = b%10;
    temp = temp*10+r;
    b=b/10;
   }
   a[i]=temp;
  }
  System.out.println(Arrays.toString(a));
 }
}