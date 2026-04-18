//nama : Muhamad Hilal S.Ahmad
//Nim : 13020240267
//tanggal & waktu pengerjaan : 18/04/2026 jam 19.03

package konversiwaktu;

public class KonversiWaktu {
    private long detik;

    public KonversiWaktu(long detik) {
        this.detik = detik;
    }

    public long jam() {
        return (detik / 3600) % 24;
    }

    public long menit() {
        return (detik / 60) % 60;
    }

    public long detik() {
        return detik % 60;
    }
}