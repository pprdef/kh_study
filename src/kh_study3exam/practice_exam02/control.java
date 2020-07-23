package kh_study3exam.practice_exam02;

import java.util.Scanner;

public class control {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		control c = new control();
		int a;
		System.out.println("---------MENU---------- ");
		System.out.println("1. 과일 이름 입력받아 가격 출력하기");
		System.out.println("2. 정수와 연산문자를 입력받아 계산하기");
		System.out.println("3. 종료하기");
		System.out.print("메뉴를 입력해 주세요 : ");
		a = sc.nextInt();
		sc.nextLine();

		switch (a) {
		case 1:
			c.fruit();
			break;
		case 2:
			c.calculator();
			break;
		case 3:
			System.out.println("종료되었습니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시시작해주십시오.");
			break;
		}
	}

	public void fruit() {
		String b;
		System.out.print("과일을 입력해주세요 :");
		b = sc.nextLine();

		switch (b) {
		case "사과":
			System.out.println("사과의 가격은 1500원 입니다.");
			break;
		case "배":
			System.out.println("배의 가격은 3000원 입니다.");
			break;
		case "딸기":
			System.out.println("딸기의 가격은 4000원 입니다");
			break;
		case "한라봉":
			System.out.println("한라봉의 가격은 5000원 입니다.");
			break;
		default: System.out.println("등록된 과일이 아닙니다.");
			break;
		}

	}

	public void calculator() {

		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산문자 : ");
		char op = sc.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			}
		}
	}
}
