package 第一周代码;

public class 代码04循环嵌套实例1 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
