package practice;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop acer = new Laptop();
		acer.laptopName = "Acer Aspire 5";
		acer.processorType = "Intel Core i5-1135G7";
		acer.ramSize = "20GB DDR4";
		System.out.println(acer.laptopName + acer.processorType + acer.ramSize);

		Laptop dell = new Laptop();
		dell.initializingVariables("Inspiron 2in1", "8 GB", "i-51155G7");

		Laptop lenovo = new Laptop("Lenovo ThinkBook 15", "i7-1165G7 Quad-Core processor", "16GB");
		System.out.println(lenovo.laptopName + lenovo.processorType + lenovo.ramSize);

	}

}
