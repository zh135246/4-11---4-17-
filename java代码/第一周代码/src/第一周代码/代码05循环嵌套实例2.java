package 第一周代码;

public class 代码05循环嵌套实例2 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<10;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			} //\t制表符作用极大，可以使运行结果看上去更加美观整齐
			System.out.println();
		}
	}

}
