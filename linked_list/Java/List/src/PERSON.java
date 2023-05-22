
public class PERSON implements INTERFACE {
	String name;
	
	public PERSON(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(name);
	}
	
	public String getInfo() {
		return name;
	}
}
