package pertemuan.pkg9;

import javax.swing.*;
import java.awt.event.*;

// Interface
interface Penilaian {
    String kualitas();
}

// Abstract Class
abstract class Smartphone {
    protected String nama;
    protected double ram; // GB

    public Smartphone(String nama, double ram) {
        this.nama = nama;
        this.ram = ram;
    }

    abstract String klasifikasi();
}

// Class Android
class Android extends Smartphone implements Penilaian {

    public Android(String nama, double ram) {
        super(nama, ram);
    }

    @Override
    String klasifikasi() {
        return "Android";
    }

    @Override
    public String kualitas() {
        return (ram >= 8) ? "Bagus" : "Standar";
    }
}

// Class iOS
class IOS extends Smartphone implements Penilaian {

    public IOS(String nama, double ram) {
        super(nama, ram);
    }

    @Override
    String klasifikasi() {
        return "iOS";
    }

    @Override
    public String kualitas() {
        return (ram >= 6) ? "Bagus" : "Cukup";
    }
}

public class pertemuan9_KlasifikasiHP {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Klasifikasi Smartphone");
        frame.setSize(350, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNama = new JLabel("Nama HP:");
        lblNama.setBounds(20, 20, 100, 25);
        frame.add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(120, 20, 180, 25);
        frame.add(txtNama);

        JLabel lblRam = new JLabel("RAM (GB):");
        lblRam.setBounds(20, 60, 100, 25);
        frame.add(lblRam);

        JTextField txtRam = new JTextField();
        txtRam.setBounds(120, 60, 180, 25);
        frame.add(txtRam);

        JLabel lblJenis = new JLabel("Sistem:");
        lblJenis.setBounds(20, 100, 100, 25);
        frame.add(lblJenis);

        String[] jenis = {"Android", "iOS"};
        JComboBox<String> combo = new JComboBox<>(jenis);
        combo.setBounds(120, 100, 180, 25);
        frame.add(combo);

        JButton btn = new JButton("Cek");
        btn.setBounds(120, 140, 100, 30);
        frame.add(btn);

        JTextArea hasil = new JTextArea();
        hasil.setBounds(20, 180, 300, 60);
        frame.add(hasil);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = txtNama.getText();
                    double ram = Double.parseDouble(txtRam.getText());
                    String jenis = combo.getSelectedItem().toString();

                    Smartphone hp;

                    if (jenis.equals("Android")) {
                        hp = new Android(nama, ram);
                    } else {
                        hp = new IOS(nama, ram);
                    }

                    Penilaian nilai = (Penilaian) hp;

                    hasil.setText(
                        "Nama: " + nama +
                        "\nSistem: " + hp.klasifikasi() +
                        "\nKualitas: " + nilai.kualitas()
                    );

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Input salah!");
                }
            }
        });

        frame.setVisible(true);
    }
}