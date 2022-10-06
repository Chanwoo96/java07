package 스레드;

public class ArrayThread extends Thread{
	@Override
	public void run() {
		String[] s = {"짜장면","치킨","피자","스테이크","회"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> "+s[i]);	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
