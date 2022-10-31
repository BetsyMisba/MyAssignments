package week1.day1;

  public class Mobile {
private void 	makeCall() {
	String mobileModel="Samsung";
	float mobileWeight=170.5f;
	
	System.out.println("makeCall");}
	private void 	sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=15000;
		System.out.println("sendMsg");
	}
public static void main(String[] args) {
Mobile obj=new Mobile(); 
obj.makeCall();
obj.sendMsg();
}
  }
