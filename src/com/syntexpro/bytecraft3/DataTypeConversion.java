package com.syntexpro.bytecraft3;

public class DataTypeConversion {
    public static void main(String[] args) {

        //Widening or Implicit ( Small memory data to large memory data )
        //   byte   >  short    >    int  >    float  >     long   >   double
        //  8 bits  >  16 bits  >  32 bits  >  32 bits  >  64 bits  >  64 bits

        System.out.println("Widening or Implicit Data Type Conversion");

        //byte > short

        byte b = 10;
        short s = b;
        System.out.println("s = " + s);

        //byte > int

        byte b1 = 20;
        int i = b1;
        System.out.println("i = " + i);

        //byte > float

        byte b2 = 30;
        float f =  b2;
        System.out.println("f = " + f);

        //byte > long

        byte b3 = 123;
        long l = b3;
        System.out.println("l = " + l);

        //byte > double

        byte b4 = 127;
        double d = b4;
        System.out.println("d = " + d);

        //short > int

        short s1 = 32_456;
        int i1 = s1;
        System.out.println("i1 = " + i1);

        //short > float

        short s2 = 23_546;
        float f1 = s2;
        System.out.println("f1 = " + f1);

        //short > long

        short s3 = 32_654;
        long l1 = s3;
        System.out.println("l1 = " + l1);

        //short > double

        short s4 = 20_321;
        double d1 = s4;
        System.out.println("d1 = " + d1);

        //int > float

        int i2 = 34_123;
        float f2 = i2;
        System.out.println("f2 = " + f2);

        //int > long

        int i3 = 1_147_483_647;
        long l2 = i3;
        System.out.println("l2 = " + l2);

        //int > double

        int i4 = 2_58_438;
        double d2 = i4;
        System.out.println("d2 = " + d2);

        //float > long
        //Type Casting since float is a real number (floating point or decimal) & long is a whole number
        float f3 = 20.1079F;
        long l3 = (long) f3;
        System.out.println("l3 = " + l3);

        //float > double

        float f4 = 92.210595F;
        double d3 = f4;
        System.out.println("d3 = " + d3);

        //long > double

        long l4 = 12_345_567;
        double d4 = l4;
        System.out.println("d4 = " + d4);

        //Narrowing or Explicit. These conversions needs Type Casting. (Large memory data to small memory data)
        //double  >   long >    float  >  int   > short  > byte
        //64bits  >   64bits  > 32bits > 32bits > 16bits > 8bits

        System.out.println("Narrowing or Explicit Data Type Conversion");

        //double > long

        double d5 = 12763.957;
        long l5 = (long) d5;
        System.out.println("l5 = " + l5);

        //double > float

        double d6 = 98.975;
        float f5 = (float) d6;
        System.out.println("f5 = " + f5);

        //double > int

        double d7 = 146.87416;
        int i5 = (int) d7;
        System.out.println("i5 = " + i5);

        //double > short

        double d8 = 32745.846385;
        short s5 = (short) d8;
        System.out.println("s5 = " + s5);

        //double > byte

        double d9 = 12.387;
        byte b5 = (byte) d9;
        System.out.println("b5 = " + b5);

        //long > float

        long l6 = 63741;
        float f6 = (float) l6;
        System.out.println("f6 = " + f6);

        //long > int

        long l7 = 32_765_875;
        int i6 = (int) l7;
        System.out.println("i6 = " + i6);

        //long > short

        long l8 = 30_546;
        short s6 = (short) l8;
        System.out.println("s6 = " + s6);

        //long > byte

        long l9 = 124;
        byte b6 = (byte) l9;
        System.out.println("b6 = " + b6);

        //float > int

        float f7 = 234.859F;
        int i7 = (int) f7;
        System.out.println("i7 = " + i7);

        //float > short

        float f8 = 1.2F;
        short s7 = (short) f8;
        System.out.println("s7 = " + f8); //Ask vaiya, how come short is giving a real number value?

        //float > byte

        float f9 = 12.764F;
        byte b7 = (byte) f9;
        System.out.println("b7 = " + b7);

        //int > short

        int i8 = 25_567;
        short s8 = (short) i8;
        System.out.println("s8 = " + s8);

        //int > byte

        int i9 = 125;
        byte b8 = (byte) i9;
        System.out.println("b8 = " + b8);

        //short > byte

        short s9 = 102;
        byte b9 = (byte) s9;
        System.out.println("b9 = " + b9);

    }
}
