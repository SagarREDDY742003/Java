class EvenOddDiff{
public static void main(String[] args){
int num = 298794;
int evenSum=0;
int oddSum=0;
int r = 0;
while(num>0){
r=num%10;
if(r%2==0)
evenSum=evenSum+r;
else
oddSum=oddSum+r;
num=num/10;
}
int diff=oddSum-evenSum;
System.out.println(diff);
}
}