package kh_study3exam.practice_exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calc cl = new Calc();
		int x;
		int y;
		System.out.print("ù��° ���� : ");
		x = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		y = sc.nextInt();
		
		cl.calc(x, y);
	}

}
