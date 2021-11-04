package BanquetHall;

public class BankApplication {

	private String name = "Gurmeen";
	private int sinNo = 1234;
	private String address = "Mississauga, Canada";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 10) {
			this.name = name;
		}
	}

	public int getSinNo() {
		return sinNo;
	}

	public void setSinNo(int sinNo) {
		
		if (sinNo>10000 && sinNo<20000)
		
		this.sinNo = sinNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
