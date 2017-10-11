
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Throwable {
//        Car car = new Car("das", "white");
//        car.showInfo();
//
//        ClassLoader cl = Thread.currentThread().getContextClassLoader();
//        Class c = cl.loadClass("Car");
//        Car car1 = (Car) c.newInstance();
//        car1.setName("byd");
//        car1.setColor("red");
//
//        Field field=c.getDeclaredField("name");
//        field.setAccessible(true);
//        field.set(car1,"toyota");
        //Method method=c.getMethod("setName",String.class);
        //method.invoke(car1,"jeep");
//        Method method1=c.getMethod("setColor",String.class);
//        method1.invoke(car1,"green");
//        car1.showInfo();

//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource resources[] = resolver.getResources("classpath*:/*.xml");
//        for (Resource resource : resources) {
//            System.out.print(resource.getDescription());
//        }

        ApplicationContext context=new AnnotationConfigApplicationContext(Beans.class);
Car car=context.getBean("car",Car.class);
System.out.print(car.getName());
    }
}
