package 스레드;

public class TryCatchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("랄랄라");
		try {
			System.out.println("입력불가"+10/0);
		} catch (Exception e) {
			System.out.println("문제 발생");
			System.out.println(e.getMessage());
		}
		System.out.println("라랄라");
	}

}
