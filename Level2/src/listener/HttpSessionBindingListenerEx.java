package listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class HttpSessionBindingListenerEx implements HttpSessionBindingListener{

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Value Bounded ");
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Value unBounded ");
	}
	
}
