public class Parent {
    String x = "No name";

    public Parent(String x) {
        this.x = x;
    }
}

class Children extends Parent {
    String xID = "0000";

    public Children(String x) {
        super(x);
    }
}
