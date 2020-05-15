package package4_HW4;

public class Main extends Bird {

	public static void main(String[] args) {

		Bird eagle = new Eagle(true, true);
		Bird swallow = new Swallow(true, true);
		Bird penguin = new Penguin(false, true);
		Bird kiwi = new Kiwi(true, true);

		System.out.println(eagle);
		System.out.println(swallow);
		System.out.println(penguin);
		System.out.println(kiwi);
	}
}
