package iteration;

public class InfiniteLoop {
	public static void main(String[] args) {
		int num=1,loop=0;
		while(true) {
			System.out.println(num);
			num *= 2;
		}
	}
}
