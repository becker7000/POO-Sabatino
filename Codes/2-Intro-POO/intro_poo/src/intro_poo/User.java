package intro_poo;

// POJO: Plain old java object
public class User { // Pascal Case o Upper Camell Case
	
	// Atributos:
	
	private int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber; // Camell Case
	
	// Métodos:	
	
	// Constructor:
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	// Getters:
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Setters:
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public void showUser() { // No te reescribas a tí mismo.
		System.out.print("\n\t Id: "+this.getId());
		System.out.print("\n\t Name: "+this.getName());
		System.out.print("\n\t Email: "+this.getEmail());
		System.out.print("\n\t Address: "+this.getAddress());
		System.out.print("\n\t Phone: "+this.phoneNumber);
	}
	
}
