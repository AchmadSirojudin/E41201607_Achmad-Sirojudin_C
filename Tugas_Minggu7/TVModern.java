package Tugas_Minggu7;

public class TVModern extends Televisi {
    static  String TELETEXT = "Teletext";
    static String TV = "Televisi";
    private String cd = "";

    public TVModern(String model, int i) {
        super(model, i);
    }

    public void setModusTampilan(String display) {
        TVModern.TELETEXT = display;
    }

    public void getModusTampilan() {
        System.out.println("Modus Tampilan : " + TELETEXT);
    }

    void setHalamanTeletext(int page) {
        System.out.println("Berpindah ke halaman Teletext : " + page);
    }
    void setDiscTray(String cd) {
        this.cd = cd;
    }
    void playCD() {
        if (cd == "") {
            System.out.println("Tidak ada cd di dalam disk tray!");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
}
