interface PhoneInterface2 {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface2 {
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) { 
		return x + y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	@Override
	public void sendCall() { 
		System.out.println("Ring ring~~");
	}
	@Override
	public void receiveCall() { 
		System.out.println("The phone is ringing.");
	}
	@Override
	public void sendSMS() { 
		System.out.println("Send text message.");
	}
	@Override
	public void receiveSMS() { 
		System.out.println("Receive text message.");
	}
	
	@Override
	public void play() { 
		System.out.println("Play music.");
	}
	@Override
	public void stop() { 
		System.out.println("Stop music.");
	}
	
	public void schedule() { 
		System.out.println("Manage schedule.");
	}
}

public class InterfaceEx2 {
	public static void main(String [] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("If add 3 and 5 " + phone.calculate(3,5));
		phone.schedule();
	}
}