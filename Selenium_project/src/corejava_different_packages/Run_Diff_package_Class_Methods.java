package corejava_different_packages;

import corejava_instant_methods.Robot;
import corejava_static_methods.InputDevices;

public class Run_Diff_package_Class_Methods 
{

	public static void main(String[] args) 
	{
		/*
		 * calling Instant method from diff package
		 * 		=> We should import package first
		 * 		=> Then call instant method in regular format
		 */
		Robot obj=new Robot();
		obj.run();
		obj.walk();
		
		
		InputDevices.keyboard();
		InputDevices.mouse();
		

	}

}