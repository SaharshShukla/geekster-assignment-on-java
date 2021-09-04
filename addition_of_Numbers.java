import java.util.Scanner;

public class addition_of_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
int num2;
int num3;
Scanner k=new Scanner(System.in);
System.out.print("Enter value of num1= ");
num1=k.nextInt();
System.out.print("Enter value of num2= ");
num2=k.nextInt();
num3=num1+num2;
System.out.println("Addition of two number is " + num3);
	}

}
