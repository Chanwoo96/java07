package 상속;

public class 사람 {
	char gen;
	String name;
	
	
	
	public void 잠자다() {
		System.out.println("잠자다.");
	}
	public void 먹다() {
		System.out.println("먹다.");
	}
	@Override
	public String toString() {
		return "사람 [gen=" + gen + ", name=" + name + "]";
	}
}
