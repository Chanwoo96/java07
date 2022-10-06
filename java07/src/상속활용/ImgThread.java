package 상속활용;



public class ImgThread extends Thread {
	
	@Override
	public void run() {
		String[] list = {"1.png","2.png","3.png","4.png","5.png"};
		for (int i =0; i < list.length; i++) {
			System.out.println(list[i]);
		try {
			
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}
