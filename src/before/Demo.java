package before;

//these are low-level module
class Email {
	public String message() {
		return "email...";
	}
}

class Line {
	public String message() {
		return "line...";
	}
}

//if you want to add a new funtion
//class SMS {
//	public String message() {
//		return "SMS...";
//	}
//}

class IPhone {
	public void read(Email email) {
		System.out.println(email.message());
	}
	public void read(Line line) {
		System.out.println(line.message());
	}
	
// you might forget to add here
//	public void read(SMS sms) {
//		System.out.println(sms.message());
//	}
}

public class Demo {
	
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		iphone.read(new Email());
		iphone.read(new Line());
//		iphone.read(new SMS());
		
	}
}

// this is not a good exsample