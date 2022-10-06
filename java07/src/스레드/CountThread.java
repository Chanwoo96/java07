package 스레드;

public class CountThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
