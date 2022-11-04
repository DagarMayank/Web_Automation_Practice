package KamalClass;

import java.util.HashMap;

public class hashmapexample {
public static void main(String[] args) {
	HashMap<String,String > map=new HashMap<>();
	map.put("mayank","mayank@123");
	map.put("sagar","sagar@123");
	map.put("srishti","srishti@123");
	
	System.out.println(map.get("mayank"));
	System.out.println(map.get("sagar"));
	System.out.println(map.get("srishti"));
}
}
