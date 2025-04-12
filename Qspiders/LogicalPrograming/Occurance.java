import java.util.Arrays;
class Occurance{
 public static void main(String[] args){

  int[] a = {1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};

  int max=a[0];

  for(int i=0; i<a.length-1;i++){
   if(a[i+1]>a[i]){
    max=a[i+1];
   }
  } 

  System.out.println(Arrays.toString(a));

  int[] b = new int[max+1];

  for(int i = 0 ; i<a.length; i++){
   b[a[i]]++; 
  }

  for(int i=0; i<b.length;i++){
    if(b[i]==0){
     continue;
    }
    else{
     System.out.println(i+ " Present "+b[i]+" times");
    }
  }

 }
}