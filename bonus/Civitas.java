// Kelas Civitas
public class Civitas implements PesertaKelas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(nama + " main di game corner");
    }

    public void naikLift() {
        System.out.println(nama + " naik lift");
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas");
    }
}