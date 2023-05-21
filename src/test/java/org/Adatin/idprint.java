package org.Adatin;

import org.Adatin.pom.printid;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class idprint extends Baseclass {
@Test
public void print() {
	printid p=new printid();
	System.out.println(attributemethod(p.getPrint(), "value"));

}
}
