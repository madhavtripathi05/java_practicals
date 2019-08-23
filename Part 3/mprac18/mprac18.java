abstract class Robot{
}

interface Motion {
    void forward();
    void reverse();
    void stop();
}

interface Sound {
    public void beep();    
}

class RobotA {

    
}

class RobotA1 extends RobotA implements Sound{
    @Override
    public void beep(){
        System.out.println("beep from A1");
    }
    
}

class RobotB implements Motion{
    @Override
    public void forward(){
        System.out.println("RobotB forward ");
    }

    @Override
    public void reverse(){
        System.out.println("RobotB reverse ");
    }

    @Override
    public void stop(){
        System.out.println("RobotB stop ");
    }

}

class RobotB1 extends RobotB implements Sound{
    @Override
    public void beep(){
        System.out.println("beep from B1");
    }
}


class RobotC implements Motion{

    @Override
    public void forward(){
        System.out.println("RobotC forward ");
    }

    @Override
    public void reverse(){
        System.out.println("RobotC reverse ");
    }

    @Override
    public void stop(){
        System.out.println("RobotC stop ");
    }
}

class RobotC1 extends RobotC implements Sound{
    @Override
    public void beep(){
        System.out.println("beep from C1");
    }
    
}

public class mprac18 {

    public static void main(String[] args) {
        RobotA1 a1 = new RobotA1();
        RobotB1 b1 = new RobotB1();

        RobotB b = new RobotB();
        RobotC c = new RobotC();
        
        a1.beep();
        b1.beep();
        b.reverse();
        c.stop();
        }
    
}