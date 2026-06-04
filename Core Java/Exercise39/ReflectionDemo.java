package Exercise39;

import java.lang.reflect.Method;

class Sample {

    public void hello() {
        System.out.println("Hello Reflection");
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Sample");

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Object obj =
                cls.getDeclaredConstructor()
                .newInstance();

        Method method =
                cls.getDeclaredMethod("hello");

        method.invoke(obj);
    }
}