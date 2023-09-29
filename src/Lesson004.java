import java.util.Scanner;

public class Lesson004 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("整数を入力してください");
		
		int Num = scanner.nextInt();
		int Answer = Num * 3;
		
		System.out.println("3倍は"+Answer);
	}

}
