package generation.dowhile;

public class ExemploDoWhile01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		int j = 0;
		
		do {
			System.out.println(++i);
			System.out.println(j++);
			Thread.sleep(500);
		}
		while(i <= 7);
	}

}
