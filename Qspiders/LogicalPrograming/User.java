import java.util.Scanner;
class User{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter name: ");
  String name = sc.nextLine();
  System.out.println("Enter department: ");
  String dept = sc.nextLine();
  System.out.println("Enter age: ");
  int age = sc.nextInt();
  System.out.println("Name: "+name); 
  System.out.println("Age: "+age);
  System.out.println("Department: "+dept);
 }
}