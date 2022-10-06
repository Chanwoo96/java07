package 스레드;

import java.util.Date;

public class TimeThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			
			Date date = new Date();
			System.out.println(date);
			//cpu 1초 stop!
			//자바에서 cpu를 연결!!
			//자바에서 외부 자원을 연결할 때는 
			//자바가 멈출 수도 있어서 대응책이 필요함.
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
