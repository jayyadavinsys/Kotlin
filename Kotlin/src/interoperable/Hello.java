package interoperable;

public class Hello {

    public static void main(String[] args){
        String massage= KotlinFileKt.sayHello("Java");
        System.out.println(massage);
    }
}
