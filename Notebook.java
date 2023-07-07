
public class Notebook {
    String name;
    int RAM;
    int HDD_SSD;
    String OS;
    String colour;

    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return RAM == t.RAM || HDD_SSD == t.HDD_SSD || OS == t.OS || colour == t.colour;
    }
}



    

