package common;




public class Contacts {
	protected long phoneNumber;
	protected String name;
	
	public Contacts(int phoneNumber, String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return (this.name + " " + this.phoneNumber);
	}
}


