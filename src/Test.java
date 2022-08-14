class Test implements  Comparable{
    public int a;
    public static int b;

    public Test(int a) {
        this.a = a;
    }

    public Test() {
    }

    public void Test(int a){
        System.out.println("Đây là phương thức trùng tên constructor");
    }

    public int sum(){
        int c=5;
        return c;
    }

    public static void main(String[] args) {
       Test test = new Test();
       test.Test(3);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

