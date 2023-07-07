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
        RAMMap.put("notebook5", 8);

        Map<String, Integer> HDD_SSDMap = new HashMap<>();
        HDD_SSDMap.put("notebook1", 500);
        HDD_SSDMap.put("notebook2", 250);
        HDD_SSDMap.put("notebook3", 256);
        HDD_SSDMap.put("notebook4", 1000);
        HDD_SSDMap.put("notebook5", 512);

        Map<String, String> OSMap = new HashMap<>();
        OSMap.put("notebook1", "MS Windows");
        OSMap.put("notebook2", "MS Windows");
        OSMap.put("notebook3", "MacOS");
        OSMap.put("notebook4", "MacOS");
        OSMap.put("notebook5", "Linux");

        Map<String, String> colourMap = new HashMap<>();
        colourMap.put("notebook1", "white");
        colourMap.put("notebook2", "black");
        colourMap.put("notebook3", "black");
        colourMap.put("notebook4", "grey");
        colourMap.put("notebook5", "grey");

        System.out.println("Hello! We have notebooks with different features(RAM, HDD or SSD, OS, colour). Each of them corresponds to a serial number from 1 to 4. Please, input the number of the feature, you are interested in.");
        System.out.println("Choose RAM - 1, HDD or SSD - 2, OS - 3, colour - 4, exit - 0");
        Integer select = sc.nextInt();
        while(select != 0){

            if (select == 1){
                System.out.printf("Choose the RAM (8, 16, 32): ");
                Integer featureRAM = sc.nextInt();
                for(String i: RAMMap.keySet()){
                    if (RAMMap.get(i).equals(featureRAM)){
                        System.out.println("We have " + i + " with " + featureRAM + " RAM");
                    }
                }
            }

            if (select == 2){
                System.out.printf("Choose the HDD/SSD (250, 256, 500, 512, 1000): ");
                Integer featureHDD_SSD = sc.nextInt();
                for(String i: HDD_SSDMap.keySet()){
                    if (HDD_SSDMap.get(i).equals(featureHDD_SSD)){
                        System.out.println("We have " + i + " with " + featureHDD_SSD + " HHD/SSD");
                    }
                }
            }


            if (select == 3){
                System.out.printf("Choose the OS (MS Windows, MacOS, Linux): ");
                String featureOS = sc.nextLine();
                for(String i: OSMap.keySet()){
                    if (OSMap.get(i).equals(featureOS)){
                        System.out.println("We have " + i + " with " + featureOS + " operation system");
                    }
                }
            }
            
            if (select == 4){
                System.out.printf("Choose the colour(white, black, grey): ");
                String featureColour = sc.nextLine();
                for(String i: colourMap.keySet()){
                    if (colourMap.get(i).equals(featureColour)){
                        System.out.println("We have " + featureColour + " " + i);
                    }
                    else{
                        System.out.println("We don't have it, please try again");
                    }
                }
            }
            
        System.out.println("Choose RAM - 1, HDD or SSD - 2, OS - 3, colour - 4, exit - 0");
        select = sc.nextInt();
        }
        System.out.println("Goodbye!");
        
    }
}