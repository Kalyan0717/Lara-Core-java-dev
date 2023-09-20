// Access with specialized method
package in.co.lara.TightCoupling;
class Bank{
	public void produceKYC() {
		System.out.println("Plase produce Following documents..");
		System.out.println("-----------------------------------");
		System.out.println("1. Pan Card\n2. Aadhar Card\n3. Two recent Passport size photographh");
	}
	public void getLoanIntrest() {
		System.out.println("\nLoan intrest details..");
		System.out.println("------------------------");
		System.out.println("Personal Loan Intrest = 14.5 % onwords");
		System.out.println("Vehical Loan Intrest = 11.5 % onwords");
		System.out.println("Home Loan Intrest = 8.5 % onwords");
		System.out.println("Education Loan Intrest = 12.5 % onwords");
	}
}
class SBI extends Bank{
	public void getLoanIntrest() {
	System.out.println("\nSBI Bank Loan intrest details..");
	System.out.println("---------------------------------");
	System.out.println("Personal Loan Intrest = 14.5 % onwords");
	System.out.println("Vehical Loan Intrest = 11.5 % onwords");
	System.out.println("Home Loan Intrest = 8.5 % onwords");
	System.out.println("Education Loan Intrest = 12.5 % onwords");
	}
	public void getLocker() {
		System.out.println("SBI Locker facility is available with only Rs. 50,000/- PA charges");
	}
}
class Kotak extends Bank{
	public void getLoanIntrest() {
	System.out.println("\nKotak Bank Loan intrest details..");
	System.out.println("-----------------------------------");
	System.out.println("Personal Loan Intrest = 19.5 % onwords");
	System.out.println("Vehical Loan Intrest = 10.5 % onwords");
	System.out.println("Home Loan Intrest = 7.5 % onwords");
	System.out.println("Education Loan Intrest = 11.5 % onwords");
	}
	public void getLocker() {
		System.out.println("KOtak Locker facility is available with only Rs. 75,000/- PA charges");
	}
}
class ICICI extends Bank{
	public void getLoanIntrest() {
	System.out.println("\nICICI Bank Loan intrest details..");
	System.out.println("-----------------------------------");
	System.out.println("Personal Loan Intrest = 15.5 % onwords");
	System.out.println("Vehical Loan Intrest = 13.5 % onwords");
	System.out.println("Home Loan Intrest = 9.75 % onwords");
	System.out.println("Education Loan Intrest = 11.75 % onwords");
	}
	public void getLocker() {
		System.out.println("ICICI Locker facility is available with only Rs. 1,25,000/- PA charges");
	}
}
class Canara extends Bank{
	public void getLoanIntrest() {
	System.out.println("\nCanara Bank Loan intrest details..");
	System.out.println("------------------------------------");
	System.out.println("Personal Loan Intrest = 14.5 % onwords");
	System.out.println("Vehical Loan Intrest = 13.65 % onwords");
	System.out.println("Home Loan Intrest = 7.75 % onwords");
	System.out.println("Education Loan Intrest = 10.65 % onwords");
	}
	public void getLocker() {
		System.out.println("Canara Locker facility is available with only Rs. 90,000/- PA charges");
	}
}
public class TightCouplingPolymarphism {

	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		b.produceKYC();
		b.getLoanIntrest();
		//b.getLocker();  UP CASTING
		((SBI)(b)).getLocker(); //DOWN CASTING
		System.out.println();
		
		b = new Kotak();
		b.produceKYC();
		b.getLoanIntrest();
		//b.getLocker();  UP CASTING
		((Kotak)(b)).getLocker();  //DOWN CASTING
		System.out.println();
		
		b = new ICICI();
		b.produceKYC();
		b.getLoanIntrest();
		//b.getLocker();  UP CASTING
		((ICICI)(b)).getLocker();  //DOWN CASTING
		System.out.println();
		
		b = new Canara();
		b.produceKYC();
		b.getLoanIntrest();
		//b.getLocker();  UP CASTING
		((Canara)(b)).getLocker(); //DOWN CASTING
		System.out.println();

	}

}
