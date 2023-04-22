package com.sukla.comps;

public class SwiftCar implements Car
{
	private CarTyres tyres;
	
	public SwiftCar(CarTyres tyres)
	{
		
		this.tyres = tyres;
	}

	@Override
	public void assemble()
	{
		System.out.println("Swift Car :: is assembled");

	}

	@Override
	public void roadTest()
	{
		System.out.println("Swift Car :: is road tested");

	}

	@Override
	public String toString()
	{
		return "SwiftCar with [tyres=" + tyres + "]";
	}
	

}
