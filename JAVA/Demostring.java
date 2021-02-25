class Demostring
{
public static void main(String args[])
{
String s1= "HELLO";
String s2= "HELLO";
String s3= new String("HELLO");
String s4= new String("HELLO");
System.out.println("Length of hello :"+s1.length());
System.out.println("Equal operator for literals "+(s1==s2));
System.out.println("Equal operator for object and its value "+(s3==s4));
}
}