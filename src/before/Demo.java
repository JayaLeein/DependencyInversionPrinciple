package before;

public class Demo {
	
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
	
	class IPhone {
		public void read(Email email) {
			System.out.println(email.message());
		}
	}

}
