import java.util.LinkedList;

public class AddressBook {

	private LinkedList <BuddyInfo> info;
	
	public void addBuddy(BuddyInfo namea) {
		
		if(namea!=null) {
		info.add(namea);
		}
		
	}
	
	public void removeBuddy(int num) {
		if(num>=0&&num<info.size()) {
		info.remove(num);
		}
	}
	public static void main (String[] args) {
		System.out.println("Address Book");
		BuddyInfo b = new BuddyInfo(null);
		b.setName("XIL");
		AddressBook a = new AddressBook();
		a.addBuddy(b);
		a.removeBuddy(0);
		//a.addBuddy(b);
		
		
	}
}
