class Armstrong{
 public static void main(String[] args){
  int n = 173;
  int c = 0; 
  int temp=0;
  int copy=n;
  int b;

  // find no of digits in the given number
  while(n>0){
   c++;
   n=n/10;
  }

  //redeclaring the value of n
  n = copy;
  //finding the sum of powers of the given number
  while(n>0){
   b=n%10;
   int d = 1;

   // calculating the power of each digit
   for(int i=1; i<=c;i++){
    d = d*b;
   }

   temp = temp + d;
   n = n/10;
  }

  if(temp==copy){
   System.out.println(copy + " is an Armstrong number");
  }
  else{
   System.out.println(copy + " is not an Armstrong number");
  }
 }
}