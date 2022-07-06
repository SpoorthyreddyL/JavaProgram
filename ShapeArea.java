package javaProject2;

public class ShapeArea {
	int dim1,dim2;
	String shape;
	public void area(int  dim1, int dim2,String shape) 
	{
	if(shape=="rectangle")
	{
	System.out.println("Area="+(dim1*dim2));	
		}
	else if(shape == "rhombus")
	 {
		System.out.println("Area of rhombus="+((dim1*dim2)/2));
	 }
	}
	 public void area (int dim1,String shape) {
		if(shape ==  "circle") {
			double pi= 3.14;
			System.out.println("area of circle="+(pi*dim1*dim1));
		}
		else {
			System.out.println("area of square="+(dim1*dim1));
		}
	}
}
	
	 
	 
	 
	
		
	


