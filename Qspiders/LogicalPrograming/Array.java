import java.util.Scanner;
class Array{
public static void main(String[] args){
String[] arr = new String[4];
Scanner sc = new Scanner(System.in);
for(int i=0; i<arr.length;i++){
System.out.print("Elements name: ");
arr[i]=sc.next();
}
System.out.print("Elements of array are: [");
for(int i=0; i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.print("]");
}
}