package 상속활용;



public class CountThread extends Thread {
	
	@Override
	public void run() {
		for (int i =20; i >= 0; i--) {
			System.out.println("카운터>> "+i);
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(i==0) {
			System.out.println("끝");
		}
		}
		
	}
}
