package P1;



public class Employee {
	int id;
	String name;
	String add;
	int zip;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public int getZip() {
		return zip;
	}

	public Employee(int id, String name, String add, int zip) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.zip = zip;
	}
	

}	