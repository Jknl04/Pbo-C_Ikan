
package zoo2;
import java.util.Scanner;

public class mainAquarium {

    
    public static void main(String[] args) {
     
    Aquarium mZ = new Aquarium("Akuarium");
    Scanner sc = new Scanner(System.in); 
    int inp = 0; 
    do { 
           System.out.println("Masukkan:");             
           System.out.println("0 untuk menambahkan Ikan"); 
           System.out.println("1 untuk memberi Vitamin");
           System.out.println("2 untuk memberi Pelet"); 
           System.out.println("3 untuk melihat hasil Perkembangan");
           System.out.println("999 untuk keluar");
    inp = sc.nextInt(); 
    switch(inp){ 
        case 0: Animal p = new Animal(); 
        if(mZ.addAnimal(p)) {
            printMessage("Ikan berhasil ditambahkan");
        }else {
            printMessage("Akuarium sudah penuh"); } break;
        case 1: mZ.beriVitamin(); break; 
        case 2: mZ.beriPelet(); break;
        case 3: int n = mZ.evolveAnimal(); 
        if(n>0) printMessage(n +" Ikan berhasil tumbuh!"); 
        else
            printMessage("Belum ada ikan yang memenuhi syarat untuk tumbuh!");
        break; 
    } 
mZ.displayAnimal(); 
} while (inp!=999); 
} 
public static void printMessage(String str)
{
System.out.println("***************************");
System.out.println("**"+str);
System.out.println("***************************"); 
}
}
    

