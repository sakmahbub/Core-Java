package chapter6;

public class methodEx {

    public static void main(String[] args) {

    }
    //////////////////////////Methods//////////////
    // 1. access modifer like public/ protected/private/default
    //If empty, then it is default

    /*2. data type like primitive(bye, short, int, float, long, 
    double, char, boolean) type,
    or class type(String or any class name) or void
    If type is void, then method will not return anything*/
 /*
    Synatx of Method
    <access Modifer>+<Data Type>+Method Name>
    +(parameter is optional)+{Body is optional, 
    BUT most cases Body thakbe}
     */
    //Method 1
    public void display() {
        System.out.println("Hi im from void method");
    }

    //Method-2 Data type is int. so we must need return keyword and value
    public int display2() {
        int x = 10;
        return x;

    }

}
