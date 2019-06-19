import java.lang.*;
import java.util.*;
interface GeometricObject{

	double getPerimeter();
	double getArea();

}

class Circle implements GeometricObject{


	protected double radius;

	Circle(){
			radius=1.0;
		
		}

	public double getPerimeter(){

		return 2*3.14*radius;
	}
	public double getArea(){

		return 3.14*radius*radius;

	}



}
interface Resizeable{

	int resize();


}
class ResizeableCircle extends Circle implements Resizeable{

	ResizeableCircle(){

		super();
	}
	public int resize(){
		int r=(int)radius;
		return r;

	}

}
class Test{

	public static void main(String[] args){

	Circle c=new Circle();
	System.out.println("Perimeter of Circle is: "+c.getPerimeter());
	System.out.println("Area of Circle is: "+c.getArea());

	ResizeableCircle rc=new ResizeableCircle();
	System.out.println("percentage of radius  is: "+rc.resize());
	System.out.println("perimeter of Circle  is: "+rc.getPerimeter());
	System.out.println("Area of Circle is: "+rc.getArea());


}
}