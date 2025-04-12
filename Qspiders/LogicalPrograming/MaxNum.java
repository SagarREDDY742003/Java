class MaxNum{

 public static void main(String[] args){
   max(2,66,77);
 }
  
 public static void max(int a, int b, int c){
  if(a>b){
   if(a>c){
     System.out.println(a+" is max num");
   }
   else{ 
     System.out.println(c+" is max num");
   }
 }
 else{
  if(b>c){ 
    System.out.println(b+" is max num");
  }
  else{ 
    System.out.println(c+" is max num");
  }
 } 
}
}