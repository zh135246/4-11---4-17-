package 第一周代码;

public class 代码03dowhile循环实例 {
	public static void main(String[] args) {
		double height=0.01;
		int i =0;
		do {
			height = height * 2;
			i++;
		} while (height <= 8848);
		System.out.println("需要折叠" + i + "次");
	}
}
