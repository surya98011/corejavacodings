package factorytest;

public class Factory {


	public Human getFactoryObject(String obj) {
		Human h;
		if(obj.equalsIgnoreCase("man")) {
			return new Man();
		}
		else if (obj.equalsIgnoreCase("women")) {
			return new Women();
		}
		else {
			return new Transgender();
		}
	}

}
