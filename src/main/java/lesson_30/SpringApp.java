package lesson_30;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Driver driver1 = context.getBean("callCarDriver",Driver.class);
        Driver driver2 = context.getBean("callBusDriver",Driver.class);
        Driver driver3 = context.getBean("callPickupDriver",Driver.class);
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
    }
}
