class Prime{
 public static void main(String[] args){
  int a = 12;
  int i=1;
  int j=0;
  while(i<=a){
   if(a%i==0){
     j++;
   }
   i++;
  }
  if(j==2){
   System.out.println(a+" is prime number");
  }
  else{ 
   System.out.println(a+" is not a prime number");
  }
 } 
}