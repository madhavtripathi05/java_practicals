// package programmingAssignment.Prac2;

class Planet {
    String name;
    int number_of_moons;

    Planet() {
        name = "";
        number_of_moons = 0;
    }

    Planet(String name, int number_of_moons) {
        this.name = name;
        this.number_of_moons = number_of_moons;
    }

    void display() {
        System.out.println("The name of the Planet is : " + name);
        System.out.println("The number of moons of the Planet is : " + number_of_moons);
        System.out.println();
    }
}

class SolarSystem {
    Planet p[] = new Planet[9];

    SolarSystem() {
        p[0] = new Planet("Mercury", 0);
        p[1] = new Planet("Venus", 0);
        p[2] = new Planet("Earth", 1);
        p[3] = new Planet("Mars", 2);
        p[4] = new Planet("Jupiter", 79);
        p[5] = new Planet("Saturn", 62);
        p[6] = new Planet("Uranus", 27);
        p[7] = new Planet("Neptune", 15);
        p[8] = new Planet("Pluto", 5);
    }

    void display() {
        for (int i = 0; i < 9; i++) {
            p[i].display();
        }
    }
}

public class Prac2 {
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem();
        s.display();
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
