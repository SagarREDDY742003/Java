class CheckChar{

 public static void main(String[] args){
   check('c');
 }
  
 public static void check(char a){
  if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
   System.out.println(a+" is a Vowel");
  else
   System.out.println(a+" is a Consonent");
 } 
}