package project2.sit;

public class Balcony extends Room implements Contract1 {

    public static final double h1=2.60;

    public final int h2=2;

    @Override
    public void faraDulap() {
        System.out.println("nu avem dreptul sa punem dulapuri la balcon");
    }

    public double getH1() {
        return h1;
    }
    public int getH2() {
        return h2;
    }

    public double diffH() {
        //upcasting h2 to double from int, so that we don't get the 0,000000001 -- not working :/
        double h3=(double) h2;
        return h1-h3;
    }

}
