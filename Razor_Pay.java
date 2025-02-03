package multiple.level.inheritence;
 interface GooglePay{
	void makePayment();
	
	
}
interface PhonePay{
	void rechargeBillpay();
}
  
class  normal implements GooglePay,PhonePay{
	static void simpleCashPayment() {
		System.out.println("Payment as cash");
	}

	@Override
	public void rechargeBillpay() {
		System.out.println("Recharge payement made using Phonepay");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Recharge payement made using Gpay");
		
	}
	
}
public  class Razor_Pay extends normal{
	//abstract void homeloan();
	
	void carloan() {
		System.out.println("Concreate method in abstarct class");
	}

	public static void main(String[] args) {
		Razor_Pay rp=new Razor_Pay();
		rp.carloan();
		rp.makePayment();
		rp.rechargeBillpay();
		rp.simpleCashPayment();
		// Multiple level inheritence

	}

}
