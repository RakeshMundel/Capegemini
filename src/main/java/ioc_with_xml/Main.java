package ioc_with_xml;

import dependencyInjection.Library;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[]args){

        //bean creation using BeanFactory
        //bean creation using classpath
        BeanFactory beanFactory1=new XmlBeanFactory(new ClassPathResource("beanConfig.xml"));
        apna_class ap1=(apna_class) beanFactory1.getBean("bean_id");
        System.out.println(ap1);

        BeanFactory beanFactory2=new XmlBeanFactory(new ClassPathResource("beanConfig.xml"));
        apna_class ap2=beanFactory1.getBean(apna_class.class);
        System.out.println(ap2);




    }
}
