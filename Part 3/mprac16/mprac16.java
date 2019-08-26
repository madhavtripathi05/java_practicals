interface Luminious {
    public void lightOn();

    public void lightOff();
}

class LuminiousCube extends Cube implements Luminious {

    public void lightOn() {
        System.out.println("Light on in Cube");
    }

    public void lightOff() {
        System.out.println("Light off in Cube");
    }
}

class LuminiousCone extends Cone implements Luminious {

    public void lightOn() {
        System.out.println("Light on");
    }

    public void lightOff() {
        System.out.println("Light off");
    }
}

class Solid {

}

class Cone extends Solid {

}

class Cube extends Solid {

}

public class mprac16 {

    public static void main(String[] args) {
        LuminiousCone lco = new LuminiousCone();
        lco.lightOn();
        lco.lightOff();
        LuminiousCube lcu = new LuminiousCube();
        lcu.lightOn();
        lcu.lightOff();
        System.out.println("\nID:18DCS129\nNAME:MADHAV");
    }
}