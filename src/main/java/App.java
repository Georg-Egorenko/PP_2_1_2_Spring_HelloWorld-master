import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getName());

        System.out.println("Cat beans are the same: " + (cat == cat2));
        System.out.println("HelloWorld beans are the same: " + (bean == bean1));

    }
}