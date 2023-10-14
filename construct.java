package vanshweek6;

public class construct {
String subject;
int fee;
	construct()
	{
		System.out.println("EXample for constructor");
	}
	construct(int age , String name){
		System.out.println("Your name is:"+ name);
		System.out.println("Your age is:"+ age);
	}
	construct(String course)
	{
		subject=course;
	}
	construct(int cost)
	{
		this.fee=cost;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
construct z=new construct();
construct c1=new construct(19,"Vansh");
construct c2=new construct("Java");
System.out.println("The subsject is"+c2.subject);
construct q=new construct(500);
System.out.println("Fee is" + q.fee);
	}

}
