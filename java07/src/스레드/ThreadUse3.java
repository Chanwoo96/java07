package 스레드;

public class ThreadUse3 {

	public static void main(String[] args) {
		//인간의 시간 단위 초, 컴퓨터의 시간단위 밀리초 1/1000
		ArrayThread t1 = new ArrayThread();
		CountThread t2 = new CountThread();
		TimeThread t3 = new TimeThread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
