package 第一周代码;

import java.util.Scanner;

public class 代码02switch语句判断星期几 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入你要输入的数字(1~7)：");
	int a=sc.nextInt();
	switch(a)
	{
	case 1:
		System.out.println("今天是星期一。");
		break;
	case 2:
		System.out.println("今天是星期二。");
		break;
	case 3:
		System.out.println("今天是星期三。");
		break;
	case 4:
		System.out.println("今天是星期四。");
		break;
	case 5:
		System.out.println("今天是星期五。");
		break;
	case 6:
		System.out.println("今天是星期六。");
		break;
	case 7:
		System.out.println("今天是星期日。");
		break;
	default:
		System.out.println("你输入的数字有误。");
	}

}

}
