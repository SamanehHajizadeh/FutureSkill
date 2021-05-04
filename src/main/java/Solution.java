public class Solution {

    public static void main(String[] args) {
        System.out.println(new Child1().read() + new Mother().read());
    }

    public static void main2(String[] args) {
        boolean ass = true;
        assert (ass) : ass = true;
        if (ass)
            System.out.println("AC");
    }

    public static void main_(String[] args) {
        int r = (int) (1.0 / 0.0);
        double R = 1.0 / 0.0;
        System.out.println(r);

        Child C1 = new Child();
        C1.x = "1";
        Child C2 = new Child();
        C2.x = "2";
        C1.start();
//        System.out.println(result);
    }
}

class Mother {
    String x = "Idali";
    protected String read() {
        return x;
    }
    protected String read(String name) {
        return x = name;
    }
}

class Child3 extends Mother {
    String xID = "0000";
    protected String read(String x) {
        return this.xID = x;
    }
}

class Child2 extends Mother {
    protected String read(String x) {
        return super.x;
    }
}

class Child1 extends Mother {
    protected String read() {
        return super.x;
    }
}

class Child extends Thread {
    String x;
    public void read() {
        System.out.println(x);
    }
}