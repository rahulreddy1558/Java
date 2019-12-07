package CollectionsRevisit;

public class Tire {
    int diameter,width;

    Tire(int diameter,int width){
        this.diameter = diameter;
        this.width = width;
    }


    @Override
    public boolean equals(Object o){
//        if( !(o instanceof Tire)) return false;
        if(o.getClass() != this.getClass()) return false;
        Tire t2 = (Tire) o;
        return this.width == t2.width && this.diameter == t2.diameter;
    }

    public static void main(String[] args) {
        Tire ti1 = new Tire(10,110);
        Tire ti2 = new Tire(10,110);
        Tire ti3 = new Tire(10,115);

        TruckTire tti3 = new TruckTire(1000,10,115);
        TruckTire tti4 = new TruckTire(1500,10,115);

    //        System.out.println(ti1.equals(ti2));
    //        System.out.println(ti1.equals(ti3));
    //        System.out.println(tti3.equals(tti4));

        System.out.println(ti3.equals(tti3));
        System.out.println(tti3.equals(ti3));

        Integer nine = 9;
        Integer five = 5;

        System.out.println(nine.compareTo(five));
        System.out.println(five.compareTo(nine));


        System.out.println(tti3 instanceof Tire);

    }

}

class TruckTire extends Tire{
    int Loadcapacity;

    public TruckTire(int Loadcapacity,int diameter,int width){
        super(diameter,width);
        this.Loadcapacity = Loadcapacity;
    }

    @Override
    public boolean equals(Object o){
//        if( !(o instanceof TruckTire)) return false;
        if(o.getClass() != this.getClass()) return false;

        TruckTire t2 = (TruckTire) o;
        return this.width == t2.width
                &&  this.diameter == t2.diameter
                && this.Loadcapacity == t2.Loadcapacity;
    }

}