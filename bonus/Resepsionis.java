public class Resepsionis {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(int idResepsionis, String jabatan, double gaji) {
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void melayani() {
        System.out.println("Resepsionis melayani");
    }

    public void melapor() {
        System.out.println("Resepsionis melapor");
    }
}
