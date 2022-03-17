package Q1;

public class TestMyClass {

    public static void main(String[] args) {
        MyClass myObject1 = new MyClass();
        myObject1.SetX(0);
        MyClass myObject2 = new MyClass();
        myObject2.SetX(7);

        System.out.println("Outputs for part b");
        myObject1.printCount(); //0
        myObject1.printX();//0
        MyClass.printCount();//0
        //**** MyClass.printX();//RuntimeException non-static method printX()
        //**** MyClass.count++;//count has private access

        System.out.println("Outputs for part b");
        myObject1.printX();//0
        myObject1.incrementCount();//increament the value of count
        myObject1.printCount();//1
        myObject2.printCount();//1
        MyClass.incrementCount();//increament the value of count
        myObject1.printCount();//2
        myObject2.printCount();//2
        myObject2.incrementCount();//increament the value of count
        myObject1.printCount();//3
        myObject2.printCount();//3
        myObject1.SetX(19);//  if we call myObject1.setX(19); then myObject1.printX();output will be 0
        myObject1.printX();//19
        myObject2.printX();//7

    }

}
