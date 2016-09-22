package com.frederik;

import nl.frederik.*;

public class UseRef
{
  public static void main(String[] args)
  {
	System.out.println ("Run UseRef.main()");
	Ref1 ref1 = new Ref1();
	ref1.printFromRef1();
	Ref2 ref2 = new Ref2();
	ref2.printFromRef2();
  }
}