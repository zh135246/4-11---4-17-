package ��һ�ܴ���;

import java.util.Scanner;

public class ����02switch����ж����ڼ� {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("��������Ҫ���������(1~7)��");
	int a=sc.nextInt();
	switch(a)
	{
	case 1:
		System.out.println("����������һ��");
		break;
	case 2:
		System.out.println("���������ڶ���");
		break;
	case 3:
		System.out.println("��������������");
		break;
	case 4:
		System.out.println("�����������ġ�");
		break;
	case 5:
		System.out.println("�����������塣");
		break;
	case 6:
		System.out.println("��������������");
		break;
	case 7:
		System.out.println("�����������ա�");
		break;
	default:
		System.out.println("���������������");
	}

}

}
