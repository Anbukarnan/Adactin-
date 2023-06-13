package org.maven.pratice;

import java.io.IOException;
import java.util.ArrayList;

import org.maven.baseclass.Baseclass;

public class filecreate extends Baseclass {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> li =new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
		li.add(9);
		li.add(2);
		li.add(3);
		li.add(18);
		li.add(9);
		li.add(44);
		li.add(33);
		li.add(55);
		for(int i=0;i<li.size();i++) {
		excelwrite(li.get(i), li.size(), "excel", li.size(), li.get(i));
		}
		System.out.println("done");
	}

	private static void excelwrite(Integer integer, int size, String sheetname, int size2, Integer integer2) {
		// TODO Auto-generated method stub
		
	}

}
