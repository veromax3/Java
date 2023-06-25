public class Notebook {
    int RAM;
    int HDD_SSD;
    String OS;
    String colour;

    public void RAM() {
        System.out.println("You chose random-access memory with storage capacity of" + RAM + "GB");
    }
    public void HDD_SSD() {
        System.out.println("You chose hard disk drive or solid state drive with storage capacity of " + HDD_SSD + "GB");
    }
    public void OS() {
        System.out.println("You chose operating system " + OS);
    }
    public void colour() {
        System.out.println("You chose " + colour + "colour");
    }


    
}
