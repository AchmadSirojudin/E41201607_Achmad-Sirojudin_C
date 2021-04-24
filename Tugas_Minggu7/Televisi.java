package Tugas_Minggu7;

public class Televisi {
    private String model;
    private int jumlahChannel = 0;
    String[] Channels = new String[jumlahChannel];
    private int volume;

    public Televisi (String model, int i) {
        this.model = model;
        this.jumlahChannel = i;
    }

    public String getDeskripsi() {
        return (model + jumlahChannel);
    }

    public void getChannels() {
        if (Channels.length == 0 ) {
            System.out.println("Belum ada Channels yang di set");
        } else {
            System.out.println("Channels berhasil di set");
        }
    }

    public void setChannels(String[] semuaChannel) {
        if (jumlahChannel >= semuaChannel.length) {
            Channels = semuaChannel;
            System.out.println("Channel berhasil diupdate! ");
        } else {
            System.out.println("Maaf tv ini hanya mampu menyimpan " + jumlahChannel + " Channel");
        }
    }

    public void setChannelAktif(int aktif) {
        if (jumlahChannel > aktif) {
            int temp = aktif - 1;
            System.out.println("Pindah Channel ke : " + Channels[temp]);
        } else {
            System.out.println("Mohon maaf anda belum berlangganan");
        }
    }

    public void setVolume(int vol) {
        System.out.println("Intensitas volume sekarang : " + vol + "%");
    }
}
