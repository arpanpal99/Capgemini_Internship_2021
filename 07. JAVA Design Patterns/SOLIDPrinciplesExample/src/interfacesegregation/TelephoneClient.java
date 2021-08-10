package interfacesegregation;

public class TelephoneClient  implements OrderInterface{

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Place order using telephone");
	}

}
