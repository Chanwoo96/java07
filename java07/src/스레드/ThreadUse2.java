package 스레드;

public class ThreadUse2 {

	public static void main(String[] args) {
		Thread11 t1 = new Thread11();
		Thread12 t2 = new Thread12();
		Thread13 t3 = new Thread13();
		t1.start();
		t2.start();
		t3.start();
	}

}
