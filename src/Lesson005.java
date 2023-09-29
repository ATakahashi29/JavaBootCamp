import java.util.Scanner;

public class Lesson005 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("整数1を入力してください");
		int Num1 = scanner.nextInt();
		
		System.out.print("整数2を入力してください");
		int Num2 = scanner.nextInt();
		
		int Sum = Num1 + Num2;
		int Sub = Num1 - Num2;
		int Mul = Num1 * Num2;
		int Div = Num1 / Num2;
		int Rem = Num1 % Num2;
		
		System.out.println("和："+ Sum);
		System.out.println("差："+ Sub);
		System.out.println("積："+ Mul);
		System.out.println("商："+ Div);
		System.out.println("余り："+ Rem);
	}

}
