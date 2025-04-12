import java.util.Arrays;
class MergeZicZacArray{
public static void main(String[] args){
 int[] a = {1,2,3,4};
 int[] b = {5,6,7,8,9,10,11};
 int[] c = new int[a.length + b.length]; 
 int i=0,j=0,k=0;

 while(i<a.length && j<b.length){
  c[k++] = a[i++];
  c[k++] = b[j++];
 }
 
 while(i<a.length){
  c[k++] = a[i++];
 } 

 while(j<b.length){
  c[k++] = b[j++];
 }

 System.out.println(Arrays.toString(a));
 System.out.println(Arrays.toString(b));
 System.out.println(Arrays.toString(c));
}
}