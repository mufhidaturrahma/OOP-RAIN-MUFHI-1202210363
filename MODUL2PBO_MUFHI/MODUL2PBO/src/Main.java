public class Main {
    public static void main(String[] args)throws Exception{
        TransportasiAir transportasi = new TransportasiAir(20, 20000);
        Kapal kapal = new Kapal(40, 30000, "Diesel");
        Sampan sampan = new Sampan(10, 15000, 2);
        transportasi.informasi();
        System.out.println();
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(40);
        kapal.berlabuh();
        System.out.println();
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println();


    }
}
