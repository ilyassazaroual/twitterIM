package esir3.im.libs;

import java.util.ArrayList;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
		
		
		List<String> params = new ArrayList<String>();
		
		params.add("@ChristelleBK");
		params.add("@dolceebee");

		System.out.println(new LibTw().getUser(params));
	}
}
