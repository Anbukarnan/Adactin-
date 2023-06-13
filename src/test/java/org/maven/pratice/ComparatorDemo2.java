package org.maven.pratice;

import java.util.Comparator;

public class ComparatorDemo2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i=(Integer) o1;
		Integer i1=(Integer) o2;
		if(i.compareTo(i1)>0)
			return 1;
		if(i.compareTo(i1)<0)
			return -1;
		else
		return 0;
	}

}
