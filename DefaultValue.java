class Test {
    int a;
    boolean istrue;
    char c;
    double d;
    long e;
    float f;
    short g;
    byte h;

    public void printValue() {
        System.out.println("int default value = " + a);
        System.out.println("boolean default value = " + istrue);
        System.out.println("char default value = " + c);
        System.out.println("double cefault value = " + d);
        System.out.println("long default value = " + e);
        System.out.println("float default value = " + f);
        System.out.println("short default value = " + g);
        System.out.println("byte default value = " + h);
    }
}

public class DefaultValue {
    public static void main (String[] args) {
        Test obj = new Test();
        obj.printValue();
    }
}
