package 第一周代码;
/*题目：小芳的妈妈每天给她2.5元钱，她都会存起来，
                 但是，每当这一天是存钱的第五天或者五的倍数的话，
                 她都会花去六元钱，请问，经过多少天，小芳才可以存到100元钱。
 */

public class 代码06题目一 {
	public static void main(String[] args) {
		int i = 0;
		double sum = 0;
		do {
			sum = sum + 2.5;
			i++;
			if(i%5==0)
			{
				sum=sum-6;
			}
		} while (sum < 100);
		System.out.println("经过"+i+"天，小芳才可以存到100元钱");
	}
}
