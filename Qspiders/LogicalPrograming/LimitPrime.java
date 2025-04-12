class LimitPrime{

 public static void main(String[] args){
   checkPrime(23,100);
 }
  
 public static void checkPrime(int l, int u){
  
  for(int i=l; i<=u; i++){
   int a = 1;
   int c = 0;
   while(a<=i){
   if(i%a==0){
     c++;
   }
   a++;
  }
  if(c==2)
   System.out.println(i+" is prime number");
 } 
} 
}