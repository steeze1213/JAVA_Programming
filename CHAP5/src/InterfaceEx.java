interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall(); 
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() { 
		System.out.println("Ring ring");
	}
	@Override
	public void receiveCall() { 
		System.out.println("The phone is ringing.");
	}
	public void flash() { System.out.println("The phone is lit.");  }
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
