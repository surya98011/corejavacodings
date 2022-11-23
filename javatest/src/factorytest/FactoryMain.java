package factorytest;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factory f = new Factory();
Human h;
h=f.getFactoryObject("Man");
h.run();

	}

}
