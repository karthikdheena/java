
public class Calc {
    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int sub(int n1, int n2) {

        return n1 - n2;
    }
}

public class AdvCalc extends Calc {
    public int multi(int n1, int n2) {

        return n1 * n2;

    }

    public int div(int n1, int n2) {

        return n1 / n2;
    }
}

public class exam {

    public static void main(String a[]) {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(10, 11);
        int r3 = obj.multi(10, 5);
        int r4 = obj.div(12, 11);

        System.out.println(r1 + "" + r2 + "" + r3 + "" + r4);

    }
}