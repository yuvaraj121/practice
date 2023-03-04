package org.phone;

public class Phone {
	public void phoneInfo(String Brand, String Model) {
		// TODO Auto-generated method stub
System.out.println("string string methods "+ Brand);
System.out.println(Model);

	}
public void phoneInfo(int InternalStorage, int ExternalStorage) {
	// TODO Auto-generated method stub
System.out.println("int int methods "+ InternalStorage );
System.out.println(ExternalStorage);
}
public void phoneInfo(float Price, String RamSize) {
	// TODO Auto-generated method stub
System.out.println("float String methods "+ Price );
System.out.println(RamSize);
}
public static void main(String[] args) {
	Phone i =new Phone();
	i.phoneInfo("samsung", "S20Ultra");
	i.phoneInfo(128, 256);
	i.phoneInfo(75000.600f," 8gb");
	
}
}
