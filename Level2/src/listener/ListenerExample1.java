package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ListenerExample1 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context initaliazed 1...");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context destroy 1 ...");
	}

}
