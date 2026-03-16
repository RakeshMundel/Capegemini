package dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("dependencyInjection.xml"));
//        Library library1=(Library)beanFactory.getBean("L1");
//        System.out.println(library1);

        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("listDependencyInjection.xml"));
        Library1 library1=(Library1)beanFactory.getBean("L1");
        System.out.println(library1);

    }
}
