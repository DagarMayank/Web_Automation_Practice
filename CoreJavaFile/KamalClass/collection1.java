package KamalClass;

import java.util.ArrayList;

public class collection1 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("mayank");
	list.add("chutki");
  int length=list.size();
  System.out.println(length);
  for(int i=0;i<list.size();i++) {
	  System.out.println(list.get(i));
  }
}
}
