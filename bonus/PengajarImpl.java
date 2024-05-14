// Kelas konkret untuk Pengajar
public class PengajarImpl extends Civitas implements Pengajar {
    public PengajarImpl(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(getNama() + " mengajar " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(getNama() + " memberikan tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(getNama() + " menilai tugas");
    }
}