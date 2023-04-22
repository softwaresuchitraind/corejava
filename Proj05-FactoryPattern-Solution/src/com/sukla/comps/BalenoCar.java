package com.sukla.comps;

public class BalenoCar implements Car
{
	private CarTyres tyres;
	
	public BalenoCar(CarTyres tyres)
	{
		System.out.println("BalenoCar.BalenoCar() :: 1-Pram constoctor");
		this.tyres = tyres;
	}

	@Override
	public void assemble()
	{
		System.out.println("Baleno Car :: is assembled");

	}

	@Override
	public void roadTest()
	{
		System.out.println("Baleno Car :: is road tested");

	}

	@Override
	public String toString()
	{
		return "Baleno Car with [tyres=" + tyres + "]";
	}
	

}
