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
        System.out.println(bean.getMessage());

        Cat beanCat =
                (Cat) applicationContext.getBean("Markiz");
        System.out.println(beanCat.getName());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("Markiz");
        System.out.println(beanCat.getName());

        System.out.println();
        System.out.println(bean == bean1);
        System.out.println(beanCat == beanCat1);
    }
}