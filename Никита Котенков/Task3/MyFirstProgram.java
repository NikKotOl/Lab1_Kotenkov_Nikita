class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass(1, 2);
        System.out.println(o.xor());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setI1(i);
                o.setI2(j);
                System.out.print(o.xor());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    }

class MySecondClass {
    private int i1;
    private int i2;

    MySecondClass(int num1, int num2){
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