class Palindrome{
 public static void main(String[] args){
  int n = 2882;
  int sum=0; 
  int temp=n;
  while(n>0){
     sum=sum*10+n%10;
     n=n/10;
  }
  if(temp == sum){0
   System.out.println(temp + " is a Palindrome");
  }
  else{
   System.out.println(temp+ " is not a Palindrome");
  }
 }
} 