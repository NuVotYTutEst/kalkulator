package tictactoe;
import java.util.Scanner;
public class kakulator {
	 public static void main(String[] args) {
		 Vvode;
		 System.out.println(Otvet());
		 
	 }
	 public static double Vvode() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Введите первое число:");
		 double a = sc.nextDouble();
		 System.out.print("Введите знак:");
		 char op = sc.next().charAt(0);
		 if (op == 's') {
			 return op, a;
		 }
		 System.out.print("Введите второе число:");
		 double b = sc.nextDouble();
		 return op; 
	 }
//	 public static double schtoto() {
//		 return Otvet(Pervoe(), Znak(), Vtoroe());
//	 }
	 public static double Otvet(double a, char op, double b) {
		 if (op == '+'){
			return plus(a,b);
		 }
		 else if (op == '-') {
			 return minus(a,b);
	        }
	     else if (op == '*') {
	    	 return umnoshitb(a,b);
	        }
	     else if (op == '/') {
	    	 return delitb(a,b);
	        }
	     else if (op == '%') {
	    	 return procent(a,b);
	        }
	     else if (op == 's') {
	     	 return sin(a);
	        }
		 return a;
	 }
	 public static double plus(double a, double b) {
		 double otvet = 0;
		 otvet = a + b;
		 return otvet;
	 }
	 public static double minus(double a, double b) {
		 double otvet = 0;
		 otvet = a - b;
		 return otvet;
	 }
	 public static double umnoshitb(double a, double b) {
		 double otvet = 0;
	 	 otvet = a * b;
		 return otvet;
	 }
	 public static double delitb(double a, double b) {
		 double otvet = 0;
		 otvet = a / b;
		 return otvet;
	 }
	 public static double procent(double a, double b) {
		 double otvet = 0;
		 otvet = a % b;
		 return otvet;
	 }
	 public static double sin(double a) {
		 double otvet = 0;
		 otvet = Math.sin(Math.toRadians(a));
		 return otvet;
	 }
}

