package Day14;

public class Lotomain {
	
	public static void  name(String[] args) {
		Loto lotto = new Loto();
		lotto.randomLotto();
		System.out.println(lotto);
		int []arr = new int[] {1,2,3,4,5,6};
		lotto.insertNumber(arr);
		System.out.println(lotto);
		System.out.println("------------");
		Loto2 Loto = new Loto2();
		lotto.randomLotto();		
		System.out.println(Loto);		
		int []arr2 = new int[] {1,2,3,4,5,6,7};		
		lotto.insertNumber(arr2);
		System.out.println(Loto);
	}

}
