import java.util.ArrayList;

public class Numbers {
    private ArrayList<String> zero;
    private ArrayList<String> one;
    private ArrayList<String> two;
    private ArrayList<String> three;
    private ArrayList<String> four;
    private ArrayList<String> five;
    private ArrayList<String> six;
    private ArrayList<String> seven;
    private ArrayList<String> eight;
    private ArrayList<String> nine;

    public Numbers() {
        this.zero = new ArrayList<>();
        zero.add("  @@  ");
        zero.add("@@  @@");
        zero.add("@@  @@");
        zero.add("@@  @@");
        zero.add("  @@  ");

        this.one = new ArrayList<>();
        one.add("  @@  ");
        one.add(" @@@  ");
        one.add("@ @@  ");
        one.add("  @@  ");
        one.add("@@@@@@");

        this.two = new ArrayList<>();
        two.add(" @@@@ ");
        two.add("@   @@");
        two.add("   @@ ");
        two.add("  @@  ");
        two.add("@@@@@@");

        this.three = new ArrayList<>();
        three.add("@@@@@@");
        three.add("    @@");
        three.add("@@@@@@");
        three.add("    @@");
        three.add("@@@@@@");

        this.four = new ArrayList<>();
        four.add("@@  @@");
        four.add("@@  @@");
        four.add("@@@@@@");
        four.add("    @@");
        four.add("    @@");

        this.five = new ArrayList<>();
        five.add("@@@@@@");
        five.add("@@    ");
        five.add("@@@@@@");
        five.add("    @@");
        five.add("@@@@@@");

        this.six = new ArrayList<>();
        six.add("@@@@@@");
        six.add("@      ");
        six.add("@@@@@@");
        six.add("@    @");
        six.add("@@@@@@");

        this.seven = new ArrayList<>();
        seven.add("@@@@@@");
        seven.add("   @@ ");
        seven.add("  @@  ");
        seven.add(" @@   ");
        seven.add("@@    ");

        this.eight = new ArrayList<>();
        eight.add("@@@@@@");
        eight.add("@    @");
        eight.add(" @@@@ ");
        eight.add("@    @");
        eight.add("@@@@@@");

        this.nine = new ArrayList<>();
        nine.add("@@@@@@");
        nine.add("@    @");
        nine.add("@@@@@@");
        nine.add("     @");
        nine.add("@@@@@@");
    }

    public ArrayList<String> getZero() {
        return zero;
    }

    public void setZero(ArrayList<String> zero) {
        this.zero = zero;
    }

    public ArrayList<String> getOne() {
        return one;
    }

    public void setOne(ArrayList<String> one) {
        this.one = one;
    }

    public ArrayList<String> getTwo() {
        return two;
    }

    public void setTwo(ArrayList<String> two) {
        this.two = two;
    }

    public ArrayList<String> getThree() {
        return three;
    }

    public void setThree(ArrayList<String> three) {
        this.three = three;
    }

    public ArrayList<String> getFour() {
        return four;
    }

    public void setFour(ArrayList<String> four) {
        this.four = four;
    }

    public ArrayList<String> getFive() {
        return five;
    }

    public void setFive(ArrayList<String> five) {
        this.five = five;
    }

    public ArrayList<String> getSix() {
        return six;
    }

    public void setSix(ArrayList<String> six) {
        this.six = six;
    }

    public ArrayList<String> getSeven() {
        return seven;
    }

    public void setSeven(ArrayList<String> seven) {
        this.seven = seven;
    }

    public ArrayList<String> getEight() {
        return eight;
    }

    public void setEight(ArrayList<String> eight) {
        this.eight = eight;
    }

    public ArrayList<String> getNine() {
        return nine;
    }

    public void setNine(ArrayList<String> nine) {
        this.nine = nine;
    }
}
