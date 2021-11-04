package TestPackage;

public class employeeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
String employee1= new String (" Robert   ");
String yearOfJoining1 = "  1994  ";
String address1 = "     64C- WallsStreat   ";

String employee2= new String (" Sam   ");
String yearOfJoining2 = new String ("    2000    ");
String address2 = new String ("      68D- WallsStreat   ");

String employee3= new String (" John   ");
String yearOfJoining3 = "   1999   ";
String address3 = "      66B- WallsStreat   ";


String infoRequired = ("  Name   "+"Year Of Joining"+ "    Address    ");
String firstEmployeeInfo = employee1+yearOfJoining1+address1;
String secondEmployeeInfo = employee2+yearOfJoining2+address2;
String thirdEmployeeInfo = employee3+yearOfJoining3+address3;


System.out.println(infoRequired);
System.out.println(firstEmployeeInfo);
System.out.println(secondEmployeeInfo);
System.out.println(thirdEmployeeInfo);

	}
}
