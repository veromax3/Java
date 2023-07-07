
public class Notebook {
    String name;
    int RAM;
    int HDD_SSD;
    String OS;
    String colour;


    // public Notebook(String name, int RAM,int HDD_SSD, String OS, String colour ){
    //     this.name = name;
    //     this.RAM = RAM;
    //     this.HDD_SSD = HDD_SSD;
    //     this.OS = OS;
    //     this.colour = colour;
    // }

    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return RAM == t.RAM || HDD_SSD == t.HDD_SSD || OS == t.OS || colour == t.colour;
    }

    @Override
    public String toString() {
        return String.format("name:%s RAM:%d HDD/SSD:%d OS:%s colour:%s", name, RAM, HDD_SSD, OS, colour);
    }
}



    

