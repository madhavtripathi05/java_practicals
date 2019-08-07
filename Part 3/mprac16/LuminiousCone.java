/**
 * LuminiousCone
 */
public class LuminiousCone extends Cone implements Luminious {

   public void lightOn()
    {
        System.out.println("Light on");
    }
    
    public void lightOff() {
        System.out.println("Light off");
    }
}