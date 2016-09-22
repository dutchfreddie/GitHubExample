package fromsrcref;

import fromsrc.CpPackage;

public class CpRefPackage
{
  public static void main(String[] args)
  {
	System.out.println ("Run CPRefPackage.main()");
	CpPackage cp = new CpPackage();
	cp.printFromCp();
  }
}