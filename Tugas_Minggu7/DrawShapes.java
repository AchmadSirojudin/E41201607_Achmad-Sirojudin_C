package Tugas_Minggu7;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {

    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public void init() {
//        Mengatur font dan di inisialisasi
        font = new Font("Arial", Font.ITALIC, 18);

//        Mengatur font dengan class color

//        Color bisa di kreasikan menggunakan warna RGB
        redColor = Color.red;
        blueColor = new Color(0, 0, 122);

//        Mengatur background color pada applet
        setBackground(backgroundColor);
        backgroundColor = Color.orange;
    }

    public void stop() {
//        Method untuk mewarnai bentuk ke layar
    }

    public void paint(@NotNull Graphics graph) {
//        Mengatur font
        graph.setFont(font);
//        Membuat Judul
        graph.drawString("DrawShapes", 90, 20);
//        Mengatur color untuk bentuk pertama
        graph.setColor(blueColor);
//        Menggambar persegi menggunakan drawRect (int x, y,
//        lebar, tinggi)
        graph.drawRect(120, 120, 120, 120);
//        Mengisi persegi
        graph.fillRect(115, 115, 90, 90);
//        Mengatur warna untuk bentuk selanjutnya
        graph.setColor(redColor);
//        Menggambar lingkaran menggunakan drawArc (int x, y, lebar,
//        tinggi, Start Angle, arcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);
//        Mengatur warna untuk bentuk selanjutnya
        graph.setColor(Color.CYAN);
//        Menggambar persegi yang lain
        graph.drawRect(50, 50, 50, 50);
//        Mengisi persegi
        graph.fillRect(50, 50, 60, 60);
    }
}