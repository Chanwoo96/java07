package 상속;

public class 상속사용 {
	public static void main(String[] args) {
		맨 m = new 맨();
		m.gen = '남';
		m.name = "클라크";
		m.size = 180;
		System.out.println(m);
		슈퍼맨 m2 = new 슈퍼맨();
		m2.gen = '남';
		m2.name = "윌리엄";
		m2.size = 200;
		m2.달리다();
		원더우먼 w1 = new 원더우먼();
		w1.gen='여';
		w1.hair=30;
		w1.name= "자스민";
		System.out.println(w1);
		
	}
}
