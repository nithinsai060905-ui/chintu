class Credit {
    private int cardno = 111234;
    private int pinno = 560900;

    public int getCardNo() {
        return cardno;
    }

    public int getPinNo() {
        return pinno;
    }
}

class Hacker extends Credit {
    void viewDetails() {
        System.out.println(getCardNo());
        System.out.println(getPinNo());
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.viewDetails();
    }
}
