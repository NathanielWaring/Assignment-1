package link;


public class Person {



	private String firstName = new String();
	private String lastName = new String();
	private String address = new String();
	private String city = new String();
	private String state = new String();
	private String zipCode = new String();

	public Person(String firstName, String lastName, String address, String city, String state,
			String zipCode) {
		this.setFirstName (firstName);
		this.setLastName (lastName);
		this.setAddress (address);
		this.setCity (city);
		this.setState (state);
		this.setZipCode (zipCode);
		

	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + "]";
	}
}
