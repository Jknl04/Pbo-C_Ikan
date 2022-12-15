
package zoo2;


public class Animal {
    private int statusTumbuh;//0-4 
    private int jumlahVitamin; 
    private int jumlahPelet;
    public Animal() { 
        statusTumbuh = 0; 
        jumlahVitamin = 0; 
        jumlahPelet = 0;
    }
    public int getJumlahVitamin(){ 
        return jumlahVitamin;
    }
    public void setJumlahVitamin(int n){ 
        jumlahVitamin = n;
    }
    public int getJumlahPelet(){ 
        return jumlahPelet;
    }
    public void setJumlahPelet(int n){ 
        jumlahPelet = n;
    }

    public void setStatusTumbuh(int n){ 
        statusTumbuh = n;
    }
    public void beriVitamin() { 
        jumlahVitamin++; 
        cekKondisiTumbuh();
    }
    public void beriPelet() { 
        jumlahPelet++; 
        cekKondisiTumbuh();
    }
    public void cekKondisiTumbuh() { 
    //cek kecukupan Vitamin dan Pelet
    if(jumlahVitamin >=4 && jumlahPelet >=5) { 
        tumbuh();
        } 
    }
    public void tumbuh() { 
        if(statusTumbuh <6) { 
            jumlahVitamin = jumlahVitamin - 4; 
            jumlahPelet = jumlahPelet - 5; 
            statusTumbuh++;}}
    public void displayAnimal() {
    System.out.println(getStatusTumbuhText());
    System.out.println("Jumlah Vitamin:" + jumlahVitamin);
    System.out.println("Jumlah Pelet:" + jumlahPelet);}

    public String getStatusTumbuhText() { 
    switch(statusTumbuh) {  
        case 0: return "Ikan Kecil"; 
        case 1: return "Ikan Sedang"; 
        case 2: return "Ikan Besar";
    } return "Telah Berkembang";
    }
    
    public int getStatusTumbuh() { 
        return statusTumbuh;
    }
    public String getImagePath() {
    String tImagePath = "img/ikan0.png"; 
    switch(statusTumbuh) { 
        case 0: tImagePath = "img/ikan0.png"; break; 
        case 1: tImagePath = "img/ikan1.png"; break;
        case 2: tImagePath = "img/ikan.png"; break;
    } return 
      tImagePath;
    }
}

