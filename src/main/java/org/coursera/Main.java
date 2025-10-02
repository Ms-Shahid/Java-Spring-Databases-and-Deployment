package org.coursera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load XML-based configuration
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringDemo demo = (SpringDemo) xmlContext.getBean("springDemo");
        demo.printMessage();
    }
}
