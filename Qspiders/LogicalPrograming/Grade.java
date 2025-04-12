class Grade{
public static void main(String[] args){
int m=108;

if(0<=m && m<=40){
System.out.println("Fail");
}

else if(41<=m && m<=60){
System.out.println("C Grade");
}

else if(61<=m && m<=75){
System.out.println("B Grade");
}

else if(76<=m && m<=90){
System.out.println("A Grade");
}

else if(91<=m && m<=100){
System.out.println("Outstanding");
}

else{
System.out.println("Enter correct mark");
}

} 
}