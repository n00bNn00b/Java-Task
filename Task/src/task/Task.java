package task;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        
        /* add & sub **/
        
        System.out.println("Input the value of a: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        
        System.out.println("Input the value of b: ");
        float b = sc.nextInt();
        
        System.out.println("Input the value of c: ");
        float c = sc.nextInt();
        
        Result1 obj = new Result1();
        float add = obj.add(a, b); // a + b
        
        float sub = obj.sub(b, c); // b - c
        /* Mult & Div */
        Result2 objs = new Result2();
        float mult = objs.mult(a, b); // a * b
        
        float a3 = objs.div1(add, 2); // (a + b) / 2
        float b3 =objs.div2(sub, a);
        
        //Final
        float c3 = mult;
        float finalAns = objs.finalS(a3, b3, c3);
        System.out.println("The Final Answer is: " + finalAns);
        
        
    }
    
}
