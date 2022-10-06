package 상속활용;

public class UseThread {

	public static void main(String[] args) {
		CountThread count = new CountThread();
		ImgThread img = new ImgThread();
		TimeThread2 time = new TimeThread2();
		
		count.start();
		time.start();
		img.start();
	}

}
