class bank {
    public void getBalance() {
        System.out.println("Rs");
    }
}

class bankA extends bank {
    public void getBalance() {
        System.out.println("MCB: Rs1000");
    }
}

class bankB extends bank {
    public void getBalance() {
        System.out.println("HBL: Rs1500");
    }
}

class bankC extends bank {
    public void getBalance() {
        System.out.println("UBL: Rs2000");
    }
}

public class main {
    public static void main(String[] args) {
        bankA a = new bankA();
        bankB b = new bankB();
        bankC c = new bankC();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}