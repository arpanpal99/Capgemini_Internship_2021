package interfacesegregation;

public class OnlinePaymentImpl implements PaymentInterface{

	@Override
	public void payForOrder() {
		// TODO Auto-generated method stub
		System.out.println("Pay Online");
	}

}
