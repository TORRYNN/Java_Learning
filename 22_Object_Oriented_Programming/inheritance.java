public class inheritance {
    public static void main(String[] args) {

        b obj1 = new b();
    }
}

// Single level Inheritance  + Multilevel Inheritance
class a {
    int a = 10;

    a() {
        System.out.println(a);
    }
}

class b extends a {
    int b = 10;

    b() {
        System.out.println(a + b);
    }
}

class c extends b {
    int c = 10;

    c() {
        System.out.println(a + b + c);
    }
}