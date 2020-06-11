package co.bacatasw.sfgdi;

import co.bacatasw.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctxt = SpringApplication.run(SfgDiApplication.class, args);

		ConstructorInjectedController constCon = (ConstructorInjectedController) ctxt.getBean("constructorInjectedController");
		System.out.println(constCon.sayHello());

		PropertyInjectedController propCon = (PropertyInjectedController) ctxt.getBean("propertyInjectedController");
		System.out.println(propCon.sayHello());

		SetterInjectedController setCon = (SetterInjectedController) ctxt.getBean("setterInjectedController");
		System.out.println(setCon.sayHello());

		MyController myCon = (MyController) ctxt.getBean("myController");
		System.out.println(myCon.sayHello());

		I18nController intCon = (I18nController) ctxt.getBean("i18nController");
		System.out.println(intCon.sayHello());
	}

}
