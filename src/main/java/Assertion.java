public class Assertion {
// False private synchronized Object o;
// False private synchronized(this) void go() { /* code here */ }
// False  void go() { synchronized() { /* code here */ }
//true    void go() { Object o = new Object(); synchronized(o) { /* code here */ }

    public static void main0(String[] args) {
        int x = 0;
        assert x>0;
            /*
        assert  ((x>0) ? "fail" : "Pass");
        */
    }

    public enum Color {
        RED(0xff000),
        GREEN(00000),
        BLUE(111111);

        Color(int rgb) {
            this.rgb = rgb;
        }

        private final int rgb;

        public int getRgb() {
            return rgb;
        }
    }

    public static void main99(String[] args) {
        Color treeColor = Color.GREEN;
    }
}
