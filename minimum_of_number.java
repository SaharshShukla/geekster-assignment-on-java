import java.util.Scanner;

public class minimum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
Scanner b=new Scanner(System.in);
System.out.print("ENTER VALUE OF NUM1= ");
num1=b.nextInt();
System.out.print("ENTER VALUE OF NUM2= ");
num2=b.nextInt();
if(num1>num2)
System.out.println("The minimum Number is"+ num2);
else
	System.out.println("The minimum Number is" +num1);

}
}
