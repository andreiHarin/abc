package project2.sit;

public class Kitchen extends Room {

    private String typeCooker;
    private int nrRefrigerator;
    private String typeRefrigerator;

//nothing
    public Kitchen(){
    }
// one param int
    public Kitchen(int nrRefrigerator){
        this("electric",nrRefrigerator,"Small");
    }
// one param String
    public Kitchen(String typeCooker){
        this.typeCooker=typeCooker;
    }
// three param
    public Kitchen(String typeCooker, int nrRefrigerator, String typeRefrigerator){
        this(typeCooker);
        this.nrRefrigerator=nrRefrigerator;
        this.typeRefrigerator=typeRefrigerator;
    }



    public String getTypeCooker() {
        return typeCooker;
    }

    public void setTypeCooker(String typeCooker) {
        this.typeCooker = typeCooker;
    }

    public int getNrRefrigerator() {
        return nrRefrigerator;
    }

    public void setNrRefrigerator(int nrRefrigerator) {
        this.nrRefrigerator = nrRefrigerator;
    }

    public String getTypeRefrigerator() {
        return typeRefrigerator;
    }

    public void setTypeRefrigerator(String typeRefrigerator) {
        this.typeRefrigerator = typeRefrigerator;
    }






}
