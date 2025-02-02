package selenium.framework;


	abstract class Amazon_1{
		abstract void login();
		abstract void logout();
		
		void getDetails() {
			System.out.println("Get details");
			
		}
		
	}

	
   abstract class Amazon_2 extends  Amazon_1{
	   abstract void auth();//need to overwritten
		abstract void otp();//need to overwritten
		void addresss() {
			System.out.println("Get address");
		}
		
	void cart() {
		System.out.println("Get cart details");
		//can be overwritten but not need
	}
		static void addtowishlist()//it cannot be overwritten
		{
			System.out.println("Get wishlist");
		}
	}
   public class Amazon_Program extends Amazon_2{
	public static void main(String[] args) {
		Amazon_Program ap=new Amazon_Program();
		ap.addresss();
        ap.auth();
        ap.cart();
        ap.getDetails();
        ap.login();
        ap.logout();
        ap.otp();
       
	}

	@Override
	void auth() {
		System.out.println("Get auth details");
		
	}

	@Override
	void otp() {
		System.out.println("Get otp details");
		
	}

	@Override
	void login() {
		System.out.println("Get login details");
		
	}

	@Override
	void logout() {
		System.out.println("Get logout details");
		
	}

}
