/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author idrm_
 */
public class MyClass {

    private int x;
    private static int count = 0;

    public MyClass() {
        //initialize x to 0
        x = 0;
    }

    public MyClass(int a) {
        //initalize x to a
        x = a;
    }

    public void SetX(int a) {
        x = a;
    }

    public void printX() {
        System.out.println(x);
    }

    public static void printCount() {
        System.out.println(count);
    }

    public static void incrementCount() {
        count++;
    
        
    }
}
