public class Dosen extends Civitas {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public void ikutPenelitian() {
        System.out.println(getNama() + " ikut penelitian");
    }
}