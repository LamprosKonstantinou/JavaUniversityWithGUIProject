
public class Student {
	
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return(name + id);
	}
	

}
