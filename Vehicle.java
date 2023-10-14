package vanshweek6;
class sportvehicle 
{
	String manufacturer
;}
class SUV extends sportvehicle
{int passengercapacity;}
class sedan extends sportvehicle
{
	String model;
}
public class Vehicle {

	public static void main(String[] args) {
		SUV z=new SUV();
	z.manufacturer="TOYOTA";
	z.passengercapacity=5;
	System.out.println("Suv details");
	System.out.println("------------");
	System.out.println("manufCTURER informationP:" + z.manufacturer);
	System.out.println("Passenger numbers  "+z.passengercapacity);
	sedan car1=new sedan();
	z.manufacturer="Honda";
	z.passengercapacity=5;
	System.out.println("Sedan details");
	System.out.println("------------");
	System.out.println("manufCTURER information:" + z.manufacturer);
	System.out.println("Passenger numbers  "+z.passengercapacity);
	}

}
