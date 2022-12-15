
package zoo2;
import java.util.ArrayList; 

public class Aquarium extends Animal{
    private int SIZE = 10; 
    private int nHewan = 0; 
    private String mZooName; 
    private ArrayList<Animal> pArrList; 
    private int hasilPerkembangan;
    public Aquarium(String pName)
    { pArrList = new ArrayList<Animal>(10);
        mZooName = pName; 
    }
      public Aquarium()
        {
                this("MyAquarium");
        }
public boolean addAnimal(Animal p){ 
    if(nHewan < SIZE){ 
        pArrList.add(p); 
        nHewan++; 
        return true;
}else return false;
}
public int evolveAnimal(){ 
    int tmpN=0; int i=0;
while ((pArrList != null) && (i < pArrList.size())) { 
    if(pArrList.get(i).getStatusTumbuh() == 3){ 
        pArrList.remove(i); nHewan--; tmpN++; i=0;
}else i++;
    	}
hasilPerkembangan = hasilPerkembangan + (tmpN*100);
return tmpN;
}
public void beriVitamin(){
    for (int i = 0; i < pArrList.size(); i++) {
        pArrList.get(i).beriVitamin();
}
}
        public void beriPelet()
        {
                for (int i = 0; i < pArrList.size(); i++) {                        
                    pArrList.get(i).beriPelet();
                }
        }
public void displayAnimal()
{
System.out.println("----------" + mZooName + "----------");
System.out.println("Terdapat " + nHewan + " ikan didalam Aquarium");
System.out.println("Point Pertumbuhanmu:" + hasilPerkembangan);
System.out.println(" ");
System.out.println(" ");

for (int i = 0; i < pArrList.size(); i++) {
                        pArrList.get(i).displayAnimal();} }
public int getHasilPerkembangan()
{ return hasilPerkembangan;
}
}
