package myfirstpackage;

public class MySecondClass {
    private int i1;
    private int i2;

    public MySecondClass(int num1, int num2){
        i1 = num1;
        i2 = num2;
    }

    public int getI1(){
        return i1;
    }

    public int getI2(){
        return i2;
    }

    public void setI1(int num){
        i1 = num;
    }

    public void setI2(int num){
        i2 = num;
    }

    public int xor() {
        return i1 ^ i2;
    }
}