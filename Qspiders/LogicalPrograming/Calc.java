class Calc{
public static void main(String[] args){
int a=10;
int b=4;
char ch = '/';

switch(ch){
case '+':
	System.out.println(a+b);
	break;
case '-':
	System.out.println(a-b);
	break;
case '*':
	System.out.println(a*b);
	break;
case '%':
	System.out.println(a%b);
	break;
case '/':
	System.out.println(a/b);
	break;
}
} 
}