package KamalClass;

import java.util.ArrayList;
import java.util.HashMap;

public class collection2 {
//to add hetrogeneous
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add("mayank");
        list.add(625);
		list.add(true);
		list.add('s');
		list.add(534.867);
		list.add('@');
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	
}
