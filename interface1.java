
import java.lang.*;
import java.util.*;
interface A{

	String myName(String s);
	
}
interface B{

	double sum(int a,int b);

}
interface C{

	void show(int a,double b);

}
interface D{

	int leng(int[] a);

}
class main{

	public static void main(String[] args){

	int[] c1 ={1,2,3,5};
	A a = (String s) -> { return s; };
	B b = (int x,int y) -> { return x+y; };
	C c = (int x,double y) -> { System.out.println(x+" "+y); };
	D d = (int[] x) -> { return x.length; };
	System.out.println("My name is : "+a.myName("Sonali"));
	System.out.println("sum of two numbers is: "+b.sum(2,3));
	
	c.show(2,3.4);
	System.out.println("length of array is: "+d.leng(c1));
}
}
