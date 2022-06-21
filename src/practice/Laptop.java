package practice;

public class Laptop {

	String laptopName;
	String ramSize;
	String processorType;

	Laptop() {

	}

	Laptop(String name, String ram, String processor) {
		laptopName = name;
		ramSize = ram;
		processorType = processor;
	}

	void initializingVariables(String nameOfLaptop, String sizeOfRam, String typeOfProcessor) {
		laptopName = nameOfLaptop;
		ramSize = sizeOfRam;
		processorType = typeOfProcessor;
	}

}
