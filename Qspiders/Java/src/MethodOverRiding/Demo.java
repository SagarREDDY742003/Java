package MethodOverRiding;
class Demo{
 public static void main(String[] args){
  Avenger a = new IronMan();
  a.fight();
  System.out.println(a.name);
 }
}

class Avenger{
 String name = "sagar";
 public void fight(){
  System.out.println("Averger Fight");
 }
}

class IronMan extends Avenger{
 String name = "John";
 public void fight(){
  System.out.println("Iron Man");
 }
}

class Thor extends Avenger{
 public void fight(){
  System.out.println("Thor");
 }
}

class Hulk extends Avenger{
 public void fight(){
  System.out.println("Hulk");
 }
}
