class RevNum{
 public static void main(String[] args){
  int n = 2898;
  int sum=0; 
  while(n>0){
     sum=sum*10+n%10;
     n=n/10;
  }
  System.out.println(sum);
  }
} 