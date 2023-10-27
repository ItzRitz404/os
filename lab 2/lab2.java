// public class lab2
// {   public static void main(String args [])  
//     { 
//         MyClass object1 = new MyClass() ;
//         // set a and b in object1
//         object1.a = 42;
//         object1.b = "my string value";
//         MyClass object2 = new MyClass();

//         // set a and b in object2
//         object2.a = 23;
//         object2.b = "my other string value";

//         // print fields:
//         // System.out.println("Field a in object1 is: " + object1.a);
//         // System.out.println("Field b in object1 is: " + object1.b);

//         // System.out.println("Field a in object2 is: " + object2.a);
//         // System.out.println("Field b in object2 is: " + object2.b);

//         System.out.println("Field a in object1:");
//         object1.printMyFields();

//         System.out.println("Field a in object2:");
//         object2.printMyFields();
//     }
// }

// class MyClass 
// { 
//     int a; 
//     String b;
// }


// class MyNewClass
// {
//     int a;
//     String b;

//     void printMyFields()
//     {
//         System.out.println("Field a is: " + a);
//         System.out.println("Field b is: " + b) ;
//     }
// }

// experiment 3

public class lab2 {
    public static void main(String args[]) {
        MyOtherClass.b = "my string value";

        MyOtherClass object1 = new MyOtherClass();
        object1.a = 50;

        MyOtherClass object2 = new MyOtherClass();
        object2.a = 45;

        object1.changeValueOfA();
        object1.changeValueofB();

        System.out.println("Fields of object1:");
        object1.printMyFields();

        System.out.println("Fields of object2: ");
        object2.printMyFields();
    }
}


class MyOtherClass {
    int a;
    static String b;

    void printMyFields() {
        System.out.println("Field a is: " + a);
        System.out.println("Field b is: " + b);
    }

    void changeValueOfA() {
        a = 100;
    }

    void changeValueofB() {
        b = "new string";
    }
}