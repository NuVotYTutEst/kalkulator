package tictactoe;
import java.util.Scanner;
public class kakulator {
	 public static void main(String[] args) {
		 Scaner(args);
		 System.out.print(Otvet(a, b));
	 }
	 public static void Otvet(String[] args) {
		 Scaner(args);
		 char op = sc.next().charAt(0);
	     vso(a, b, op);
	 }
	 public static void Scaner(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Введите первое и второе число:");
		 int a = sc.nextInt();
	     int b = sc.nextInt();
	     System.out.print("Введите тип операции которую хотите выполнить( +, -, *, /, % ):");
	 }
	 public static int vso(int a, int b, char op) {
		 int otvet = 0;
		 if (op == '+'){
			 otvet = a + b;
		 }
		 else if (op == '-') {
			 otvet = a - b;
	        }
	     else if (op == '*') {
	    	 otvet = a * b;
	        }
	     else if (op == '/') {
	    	 otvet = a / b;
	        }
	     else if (op == '%') {
	    	 otvet = a % b;
	        }
		 System.out.println("Ответ:" + otvet);
		 return otvet;
	 }
}


