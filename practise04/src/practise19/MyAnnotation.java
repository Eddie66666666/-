package practise19;

/**
 * 1.注解声明为interface
 * @author LiuJun
 * @create 2021-10-19-15:08
 */

public @interface MyAnnotation {
    String value() default "hello";

}
