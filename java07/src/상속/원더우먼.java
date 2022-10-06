package 상속;

public class 원더우먼 extends 우먼{
	 int hair;
	 public void 때리다() {
		System.out.println("때리다.");
		
	}
	@Override
	public String toString() {
		return "원더우먼 [hair=" + hair + ", gen=" + gen + ", name=" + name + "]";
	}


}
