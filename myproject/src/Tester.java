

public class Tester {

	public static void main(String[] args) {
		AddServices services=new AddServices();
        Add add=new Add();
        add.setA(10);
        add.setB(20);
		services.addNumber(add);
	}
}
