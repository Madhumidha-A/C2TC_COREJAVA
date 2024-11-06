package com.tnsif.ifet.dayeight.nestedinterfaces;

public interface MyInterface {
	void calculateArea();
    interface MyInnerInterface {
       int  id = 20;
       void print();     
    }
}
