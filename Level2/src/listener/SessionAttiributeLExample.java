package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class SessionAttiributeLExample implements HttpSessionAttributeListener{

@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
	System.out.println("SessionAttiributeLExample Added");
	}

@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
	System.out.println("SessionAttiributeLExample Deleted");
	
	}

@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
	System.out.println("SessionAttiributeLExample Update");
	}

}
