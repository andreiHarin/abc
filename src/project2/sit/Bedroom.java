package project2.sit;

public class Bedroom extends Room{
    private int nrChairs;
    private String typeSofa;

    @Override
    public String getColour() {
        return "bedroom always dark aka batman aka Dark Knight";
    }

    public int getNrChairs() {
        return nrChairs;
    }

    public void setNrChairs(int nrChairs) {
        this.nrChairs = nrChairs;
    }

    public void setTypeSofa(String typeSofa) {
        this.typeSofa = typeSofa;
    }

    public String getTypeSofa(){
        return typeSofa;
    }
}
