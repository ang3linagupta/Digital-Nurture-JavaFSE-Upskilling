public class PatternMatchingSwitchDemo {

    static void checkType(Object obj) {

                if (obj == null) {
                        System.out.println("Null");
                } else if (obj instanceof Integer i) {
                        System.out.println("Integer: " + i);
                } else if (obj instanceof String s) {
                        System.out.println("String: " + s);
                } else if (obj instanceof Double d) {
                        System.out.println("Double: " + d);
                } else {
                        System.out.println("Unknown Type");
                }
    }

    public static void main(String[] args) {

        checkType(100);
        checkType("Hello");
        checkType(55.5);
    }
}