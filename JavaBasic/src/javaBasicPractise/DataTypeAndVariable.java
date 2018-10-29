package javaBasicPractise;

public class DataTypeAndVariable {
	
	
	short sh = 10;
	byte bt = 20;
	int in = 30;
	long ln = 40;
	float fl = 50.99f;
	double dl = 60.88;
	char ch = 'A';
	boolean bl = true;
	//Static variable 
	static short s = 10;
	static byte b = 20;
	static int i = 30;
	static long l = 40;
	static float f = 50.99f;
	static double d = 60.88;
	static char c = 'A';
	static boolean bn = true;
	
	public void DataAndVariable()
	{
		short sh = 10;
		byte bt = 20;
		int in = 30;
		long ln = 40;
		float fl = 50.99f;
		double dl = 60.88;
		char ch = 'A';
		boolean bl = true;
		
		System.out.println("short value is "+sh);
		System.out.println("byte value is "+bt);
		System.out.println("int value is "+in);
		System.out.println("long value is "+ln);
		System.out.println("float value is "+fl);
		System.out.println("double value is "+dl);
		System.out.println("char value is "+ch);
		System.out.println("boolean value is "+bl);
	}

	public static void main(String[] args) {
		
		
		DataTypeAndVariable dataVariable = new DataTypeAndVariable();
		
		System.out.println("___________________instance variable________________________");
		
		System.out.println("short value is "+dataVariable.sh);
		System.out.println("byte value is "+dataVariable.bt);
		System.out.println("int value is "+dataVariable.in);
		System.out.println("long value is "+dataVariable.ln);
		System.out.println("float value is "+dataVariable.fl);
		System.out.println("double value is "+dataVariable.dl);
		System.out.println("char value is "+dataVariable.ch);
		System.out.println("boolean value is "+dataVariable.bl);
		
		
		System.out.println("___________________static variable________________________");
		
		System.out.println("short value is "+s);
		System.out.println("byte value is "+b);
		System.out.println("int value is "+i);
		System.out.println("long value is "+l);
		System.out.println("float value is "+f);
		System.out.println("double value is "+d);
		System.out.println("char value is "+c);
		System.out.println("boolean value is "+bn);
		
		System.out.println("___________________local  variable________________________");
		dataVariable.DataAndVariable();
	}

}
