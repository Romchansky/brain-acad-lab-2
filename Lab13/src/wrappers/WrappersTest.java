package wrappers;


public class WrappersTest {

    public static void main(String[] args) {

        {
            Character c1 = 'H';
            Character c2 = Character.valueOf('H');
            Character c3 = new Character('H');
//           Character c4 = Character.parseCharacter('H');

            Byte b1 = 12;
            Byte b2 = Byte.valueOf((byte) 2);
            Byte b3 = new Byte((byte) 2);
            Byte b4 = Byte.parseByte("12");

            Short s1 = 12454;
            Short s2 = Short.valueOf((short) 12345);
            Short s3 = new Short((short) 11234);
            Short s4 = Short.parseShort("12456");

            Integer i1 = 13;
            Integer i2 = Integer.valueOf(13);
            Integer i3 = new Integer(13);
            Integer i4 = Integer.parseInt("13");
            Integer i = Integer.valueOf(1777);
            System.out.println(i);

            Float f1 = 1245f;
            Float f2 = Float.valueOf(1234f);
            Float f3 = new Float(1225f);
            Float f4 = Float.parseFloat("12564");

            Double d1 = 13545d;
            Double d2 = Double.valueOf(45646d);
            Double d3 = new Double(44564d);
            Double d4 = Double.parseDouble("445455");

            Long l1 = 1500L;
            Long l2 = Long.valueOf(1500L);
            Long l3 = new Long(1500L);
            Long l4 = Long.parseLong("1500");
        }

        {
            Double d12 = 23.45;
            double dd12 = d12;
            byte b12 = d12.byteValue();
            short s12 = (short) d12.parseDouble(d12.toString());
            int i12 = (int) (double) d12;
            float f12 = (float) d12.doubleValue();
            long l12 = (long) dd12;
        }

        {
            Double d = 0.0;
            Double dd = 1.0;
            Double nanValue = dd / d;
            Double infinityValue = 10.0;
            infinityValue = d / infinityValue;
            System.out.println("variable 1" + nanValue);
            System.out.println("variable 2" + infinityValue);

            if (nanValue.isNaN()) {
                System.out.println("varible" + nanValue + "= NaN");
            }
            if (infinityValue.isNaN()) {
                System.out.println("varible" + infinityValue + "= Infinity ");
            }
            if (nanValue.isInfinite()) {
                System.out.println("varible" + nanValue + "= NaN");
            }
            if (infinityValue.isInfinite()) {
                System.out.println("varible" + infinityValue + "= Infinity ");
            }
        }
        {
            Long l1 = 120L;
            Long l2 = 120L;
            System.out.println(l1==l2);
            l1 = 1200L;
            l2 = 1200L;
            System.out.println(l1==l2);

        }
    }

}