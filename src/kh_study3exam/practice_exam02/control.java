package kh_study3exam.practice_exam02;

import java.util.Scanner;

public class control {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		control c = new control();
		int a;
		System.out.println("---------MENU---------- ");
		System.out.println("1. ���� �̸� �Է¹޾� ���� ����ϱ�");
		System.out.println("2. ������ ���깮�ڸ� �Է¹޾� ����ϱ�");
		System.out.println("3. �����ϱ�");
		System.out.print("�޴��� �Է��� �ּ��� : ");
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
			System.out.println("����Ǿ����ϴ�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽý������ֽʽÿ�.");
			break;
		}
	}

	public void fruit() {
		String b;
		System.out.print("������ �Է����ּ��� :");
		b = sc.nextLine();

		switch (b) {
		case "���":
			System.out.println("����� ������ 1500�� �Դϴ�.");
			break;
		case "��":
			System.out.println("���� ������ 3000�� �Դϴ�.");
			break;
		case "����":
			System.out.println("������ ������ 4000�� �Դϴ�");
			break;
		case "�Ѷ��":
			System.out.println("�Ѷ���� ������ 5000�� �Դϴ�.");
			break;
		default: System.out.println("��ϵ� ������ �ƴմϴ�.");
			break;
		}

	}

	public void calculator() {

		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("���깮�� : ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				break;
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			}
		}
	}
}
