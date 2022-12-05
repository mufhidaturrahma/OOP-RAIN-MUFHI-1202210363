public class TransportasiAir {
    protected int jumlahKursi; int biaya;
 
    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.printf("Transportasi air jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp %d\n",this.jumlahKursi,this.biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi air dengan jenis yang tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air dengan jenis yang tidak diketahui berlabuh di pantai");
    }
 }
 