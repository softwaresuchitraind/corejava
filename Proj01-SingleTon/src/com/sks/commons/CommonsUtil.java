package com.sks.commons;

import java.io.Serializable;

public class CommonsUtil implements Cloneable,Serializable
{
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		
		return super.clone();//uses jav.lang .Clone for Cloning process
	}
}
