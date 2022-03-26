package pkg1;

public class MyClass1 {
	
	public void f1()
	{
		int a=10;
		int b=20;
		int c=10+20;
		System.out.println("Hello Sonarqube");
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		MyClass1 ob = new MyClass1();
		ob.f1();
		

	}

}
