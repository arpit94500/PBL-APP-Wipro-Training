
public class Test {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		System.out.println(i.getSavingsInterestRate());
		System.out.println(i.getFixedDepositInterestRate());
		KotMBank k=new KotMBank();
		System.out.println(k.getSavingsInterestRate());
		System.out.println(k.getFixedDepositInterestRate());
		GeneralBank g=new KotMBank();
		System.out.println(g.getFixedDepositInterestRate());
		System.out.println(g.getSavingsInterestRate());
		g=new ICICIBank();
		System.out.println(g.getFixedDepositInterestRate());
		System.out.println(g.getSavingsInterestRate());


	}

}
