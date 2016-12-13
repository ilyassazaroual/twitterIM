package esir3.im.libs;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		LibTw myLibTw = new LibTw();
		List<String> params = new ArrayList<String>();
		params.add("CorentinHcd");
		params.add("#perduDansLaFrance");
		System.out.println(myLibTw.getUser(params));
	}
}
