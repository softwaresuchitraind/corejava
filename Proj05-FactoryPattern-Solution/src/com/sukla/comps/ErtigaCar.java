package com.sukla.comps;

public class ErtigaCar implements Car
{
	private CarTyres tyres;
	
	public ErtigaCar(CarTyres tyres)
	{
		System.out.println("ErtigaCar.ErtigaCar() :: 1-param constuctor");
		this.tyres = tyres;
	}

	@Override
	public void assemble()
	{
		System.out.println("ErtigaCar Car :: is assembled");

	}

	@Override
	public void roadTest()
	{
		System.out.println("ErtigaCar Car :: is road tested");

	}

	@Override
	public String toString()
	{
		return "Ertiga Car with [tyres=" + tyres + "]";
	}
	

}
