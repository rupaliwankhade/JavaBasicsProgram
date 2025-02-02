package selenium.framework;
interface API{
	
	void apikey();
}

public class Amazon_InterfaceClass implements API {
	
	

	public static void main(String[] args) {
		Amazon_InterfaceClass a1=new Amazon_InterfaceClass();
		a1.apikey();

	}

	@Override
	public void apikey()
	{
		System.out.println("Apikey");
		
	}

}
