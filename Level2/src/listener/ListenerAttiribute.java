package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ListenerAttiribute implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("Eklendi.");

	}
	
	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("Silindi.");

	}
	
	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("Güncellendi.");
	}
	
}
