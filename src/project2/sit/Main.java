package project2.sit;


public class Main {
    int abc;
    public static void main(String[] args) {
	// write your code here

        Room room1 = new Room();
        room1.setLength(3.00);
        room1.setWidth(4.00);
        System.out.println("Area of  room1 is: "+room1.getArea());

        Bedroom room2 = new Bedroom();
        room2.setColour("Red");
        System.out.println("Colour of room2 is: "+room2.getColour());

        Kitchen room3= new Kitchen("on fuel",2,"Big");
        System.out.println("room3 typeCooker: "+room3.getTypeCooker());
        System.out.println("room3 nrRefrigerator: "+room3.getNrRefrigerator());
        System.out.println("room3 typeRefrigerator: "+room3.getTypeRefrigerator());

        Balcony room4 = new Balcony();
        System.out.println("room4 h1: " + room4.getH1());
        System.out.println("room4 h2: " + room4.getH2());
        System.out.println("difference in h1 and h2: " + room4.diffH());
        room4.faraDulap();

        // orice balcon e si 'camera', in special cand ai venit beat acasa

        //upcasting
        Room room55 = new Balcony();
            // room55.getH2 is not accessible
        //downcasting explicitly
        Balcony room555= (Balcony) room55;
        //downcasting nice
        Balcony room5551=(Balcony) new Room();

        System.out.println(room555.getH2());
        System.out.println(room5551.getH2());
    }
}
