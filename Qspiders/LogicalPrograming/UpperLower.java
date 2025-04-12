class UpperLower{

 public static void main(String[] args){
   check('a');
 }
  
 public static void check(char a){
  if('a'<=a && a<='z')
   System.out.println("Given character is in lower case");
  else
   System.out.println("Given character is in upper case");
 } 
}