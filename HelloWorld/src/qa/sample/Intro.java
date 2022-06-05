package qa.sample;

public class Intro {
	int b = 23;
	public void add(int a){
	int c=a+b;
	System.out.println(c);	
	}
	public static void main(String[] args) {
		Intro i = new Intro();
		i.add(2);
		System.out.println("hii");
	}
}
