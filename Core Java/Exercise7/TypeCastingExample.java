public class TypeCastingExample {
    public static void main(String[] args) {

        double d = 45.78;
        int i = (int) d;

        int num = 25;
        double converted = num;

        System.out.println("Double Value: " + d);
        System.out.println("After Casting to int: " + i);

        System.out.println("Int Value: " + num);
        System.out.println("After Casting to double: " + converted);
    }
}