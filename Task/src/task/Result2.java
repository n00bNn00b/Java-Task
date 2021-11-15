package task;


public class Result2 {
    float mult(float a, float b) {
        float s3 = a * b;
        System.out.println("mult " + s3); // resolving only
        return s3;
        
    }
    float div1(float a1, float b1) {
        float s4 = a1 / b1;
        System.out.println("div1 " + s4);
        return s4;
    }
    float div2(float b2, float c2) {
        float s5 = b2 / c2;
        System.out.println("div2 " + s5);
        return s5;
    }
    float finalS(float a3, float b3, float c3) {
        float finalResult = a3 + b3 - c3;
        return finalResult;
    }
}
