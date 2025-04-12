class Book{
 String title;
 String author;
 int noOfPages;
 int price;
 public static void main(String[] args){}
}

class Bag{
 public static void main(String[] args){

  Book b1 = new Book();
  Book b2 = new Book();
  Book b3 = new Book();

  b1.title = "Game Of Thrones";
  b1.author = "Basha";
  b1.noOfPages = 1000;
  b1.price = 600;

  System.out.println(" Title: " + b1.title + "\n Author: " + b1.author + "\n NoOfPages: " + b1.noOfPages + "\n Price: " + b1.price);

  System.out.println("====================================================");

  b2.title = "Vikings";
  b2.author = "Jhon";
  b2.noOfPages = 2000;
  b2.price = 900;

  System.out.println(" Title: " + b2.title + "\n Author: " + b2.author + "\n NoOfPages: " + b2.noOfPages + "\n Price: " + b2.price);

  System.out.println("====================================================");

  b3.title = "Dark";
  b3.author = "Sagar";
  b3.noOfPages = 800;
  b3.price = 500;

  System.out.println(" Title: " + b3.title + "\n Author: " + b3.author + "\n NoOfPages: " + b3.noOfPages + "\n Price: " + b3.price);
 }
}