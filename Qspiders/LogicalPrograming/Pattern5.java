class Pattern5{
 public static void main(String[] args){
  int a = 4;
  for(int i=1; i<=a; i++){
    for(int j=1; j<=a*2-1; j++){
        if(i<=j && i+j<=a*2){
	  System.out.print("* ");
	}
	else{
	  System.out.print("  ");
	}
     }
    System.out.println();
  }
 } 
}