public class Main {
    public static void main(String[] args) {
        // Membuat instansi dari masing-masing konkret class
        Civitas civitas = new Civitas("Eko", 25, true);
        Resepsionis resepsionis = new Resepsionis(123, "Receptionist", 2000);
        Mahasiswa mahasiswa = new Mahasiswa("Ali", 20, false, "123456", 3.5, 1);
        Dosen dosen = new Dosen("Drajad", 40, true, "78910", 5000);
        Asprak asprak = new Asprak();
        PengajarImpl pengajar = new PengajarImpl("Prof. Argus", 50, true);

        // Menerapkan konsep upcasting
        PesertaKelas pesertaMahasiswa = new Mahasiswa("Bob UHUY", 22, true, "987654", 3.8, 2);
        PesertaKelas pesertaDosen = new Dosen("Dr. Gigi", 45, false, "54321", 6000);
        PesertaKelas pesertaAsprak = new Asprak();
        PesertaKelas pesertaPengajar = new PengajarImpl("Dr. Chau Ni MA", 55, false);

        // Memanggil method
        civitas.masukKelas();
        civitas.makanDiKantin("Kantin A");
        civitas.mainGameCorner();
        civitas.naikLift();

        resepsionis.melayani();
        resepsionis.melapor();

        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("HMJ");

        dosen.ikutPenelitian();

        asprak.ngasihKomenDiGCR();

        pengajar.mengajar("Matematika");
        pengajar.mengasihTugas();
        pengajar.menilaiTugas();

        // Memanggil method setelah upcasting
        pesertaMahasiswa.masukKelas();
        pesertaDosen.masukKelas();
        pesertaAsprak.masukKelas();
        pesertaPengajar.masukKelas();
    }
}
