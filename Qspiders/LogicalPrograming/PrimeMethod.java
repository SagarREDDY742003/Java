class PrimeMethod{

 public static void main(String[] args){
   checkPrime(23);
 }
  
 public static void checkPrime(int a){
  int i=1;
  int c = 0;
  while(i<=a){
   if(a%i==0){
     c++;
   }
   i++;
  }
  if(c==2)
   System.out.println(a+" is prime number");
  else
   System.out.println(a+" is not a prime number");
 } 
}