package sol;

interface Receiver {
	public String message();
}

//class Email {
//	public String message() {
//		return "email...";
//	}
//}

class Email implements Receiver  {

	public String message() {
		return "email...";
	}
		
}

//class Line {
//	public String message() {
//		return "line...";
//	}
//}

class Line implements Receiver {
	
	public String message() {
		return "line...";
	}
}

class SMS implements Receiver {
	
	public String message() {
		return "SMS...";
	}
}

//class IPhone {
//	public void read(Email email) {
//		System.out.println(email.message());
//	}
//	public void read(Line line) {
//		System.out.println(line.message());
//	}

class IPhone {
	public void read(Receiver receiver) {
		System.out.println(receiver.message());
	}
}

public class DIP {
	
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		iphone.read(new Email());
		iphone.read(new Line());
		iphone.read(new SMS());
		
	}

}
