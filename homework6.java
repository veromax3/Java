import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notebook notebook1 = new Notebook();
        notebook1.RAM = 16;
        notebook1.HDD_SSD = 500; 
        notebook1.OS = "MS Windows";
        notebook1.colour = "white";

        Notebook notebook2 = new Notebook();
        notebook2.RAM = 8;
        notebook2.HDD_SSD = 250; 
        notebook2.OS = "MS Windows";
        notebook2.colour = "black";

        Notebook notebook3 = new Notebook();
        notebook3.RAM = 8;
        notebook3.HDD_SSD = 256; 
        notebook3.OS = "MacOS";
        notebook3.colour = "black";

        Notebook notebook4 = new Notebook();
        notebook4.RAM = 32;
        notebook4.HDD_SSD = 1000; 
        notebook4.OS = "MacOS";
        notebook4.colour = "grey";

        Notebook notebook5 = new Notebook();
        notebook5.RAM = 8;
        notebook5.HDD_SSD = 512; 
        notebook5.OS = "Linux";
        notebook5.colour = "grey";

        Map<String, Integer> RAMMap = new HashMap<>();
        RAMMap.put("notebook1", 16);
        RAMMap.put("notebook2", 8);
        RAMMap.put("notebook3", 8);
        RAMMap.put("notebook4", 32);

        Map<String, Integer> HDD_SSDMap = new HashMap<>();
        HDD_SSDMap.put("notebook1", 500);
        HDD_SSDMap.put("notebook2", 250);
        HDD_SSDMap.put("notebook3", 256);
        HDD_SSDMap.put("notebook4", 1000);

        Map<String, String> OSMap = new HashMap<>();
        OSMap.put("notebook1", "MS Windows");
        OSMap.put("notebook2", "MS Windows");
        OSMap.put("notebook3", "MacOS");
        OSMap.put("notebook4", "Linux");

        Map<String, String> colourMap = new HashMap<>();
        colourMap.put("notebook1", "white");
        colourMap.put("notebook2", "black");
        colourMap.put("notebook3", "grey");
        colourMap.put("notebook4", "grey");

        System.out.println("Input a number of criterion (1 - RAM, 2 - HDD or SSD, 3 - OS, 4 - colour)");

        int filter = sc.nextInt();
        if (filter == 1){
            System.out.println("Input the minimum number of gigabytes for RAM");
            

        }




        sc.close();









    }
    
}
