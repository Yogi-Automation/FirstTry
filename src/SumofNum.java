import java.util.Scanner;
class SumofNum {
	static int number;
	void sumingOfNum() {
		int sum = 0;
		Scanner getNumber = new Scanner(System.in);
		number = getNumber.nextInt();
		while(number != 0)
		{
			int num = number%10;
			sum = sum+num;
			number = number/10;
		}
		System.out.print("Sum of number : "+sum);
	}
}