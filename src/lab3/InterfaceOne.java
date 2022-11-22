package lab3;

public class InterfaceOne {
    public static void main(String[] args) {
        Double a = Double.valueOf(1.5);
        System.out.println(a);

        Double b = Double.parseDouble("1.5");
        System.out.println(b);

        int ib = b.intValue();
        short sb = b.shortValue();
        long lb = b.longValue();
        byte bb = b.byteValue();
        float fb = b.floatValue();
        double db = b;
//        boolean bbb = ;
//        char cb = ;

        Double newdouble = Double.valueOf(1.5);
        System.out.println(newdouble);

        String str = Double.toString(3.14);
        System.out.println(str);
    }
}
