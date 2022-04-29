package greeter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {


		public static void main(String[] args) {
			String springConfigurationFile = "greeter-beans.xml";
			
			
			AbstractApplicationContext appContext = 
					new ClassPathXmlApplicationContext(springConfigurationFile);
			
			Greeter g = appContext.getBean("greeter", Greeter.class);
			g.greet();
			
			Visitor visitor = appContext.getBean("vis",Visitor.class);
			System.out.println(visitor.getGreeting());
			System.out.println(visitor.getName());
			appContext.close();
		}


}
