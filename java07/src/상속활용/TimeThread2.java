package 상속활용;

import java.util.Date;

public class TimeThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <=20; i++) {
			Date date = new Date();
			System.out.println("시각>> " + date);
			try {

				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
