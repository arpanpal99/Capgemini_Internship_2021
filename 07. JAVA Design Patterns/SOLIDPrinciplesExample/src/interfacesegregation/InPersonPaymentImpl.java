package interfacesegregation;

public class InPersonPaymentImpl implements PaymentInterface{

	@Override
	public void payForOrder() {
		// TODO Auto-generated method stub
		System.out.println("Cash on Order");
	}

}
