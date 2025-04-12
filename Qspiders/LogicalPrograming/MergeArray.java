import java.util.Arrays;
class MergeArray{
public static void main(String[] args){
 int[] a = {1,2,3,4};
 int[] b = {5,6,7};
 int[] c = new int[a.length + b.length]; 
 for(int i=0;i<a.length;i++){
  c[i]=a[i];
 }
 for(int j=0;j<b.length;j++){
  c[a.length+j]=b[j];'
 }
 System.out.println(Arrays.toString(a));
 System.out.println(Arrays.toString(b));
 System.out.println(Arrays.toString(c));
}
}