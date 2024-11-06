package com.tnsif.ifet.dayeight;

public abstract class Shape {
	protected static float area;
    
    //abstract method 
	 void calArea() {
		// TODO Auto-generated method stub
		
	}
	 
	 //concrete method
	 static void show()
	 {
		 try {
			System.out.println("Area of shape is "+area);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
