package id.ac.uniska;

import object.Class_3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText  extends JFrame{
    JLabel label1 = new JLabel("Nama Lengkap");
    JTextField textField = new JTextField();
    JButton tombol = new JButton("Greet");

    JLabel namamakanan = new JLabel("Nama Makanan");
    JLabel namaminuman = new JLabel("Nama Minuman");
    JLabel hrgmakanan = new JLabel("Harga Makanan");
    JLabel hrgminuman = new JLabel("Harga Minuman");
    JLabel hasil = new JLabel("Hasil");

    JTextField inputmkn = new JTextField();
    JTextField inputmn = new JTextField();
    JTextField hmkn = new JTextField();
    JTextField hmn = new JTextField();
    JTextField byr= new JTextField();
    JButton btnHitung = new JButton("Hitung");


    GuiByText(){
        setSize( 640, 480);
        setLocationRelativeTo(null);
        setTitle("Gui By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    void LetakanKomponen()
    {
        getContentPane().setLayout(null);
        getContentPane().add(label1);
        getContentPane().add(textField);
        getContentPane().add(tombol);


        label1.setBounds(16, 32, 100, 25);
        textField.setBounds(124, 32, 300, 25);
        tombol.setBounds(232, 32, 200, 25);

        tombol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nama = textField.getText();
                JOptionPane.showMessageDialog(null, "Hai "+nama);
            }
        });

        getContentPane().add(namamakanan);
        getContentPane().add(namaminuman);
        getContentPane().add(hrgmakanan);
        getContentPane().add(hrgminuman);
        getContentPane().add(hasil);
        getContentPane().add(inputmkn);
        getContentPane().add(inputmn);
        getContentPane().add(hmkn);
        getContentPane().add(hmn);
        getContentPane().add(byr);
        getContentPane().add(btnHitung);

        namamakanan.setBounds(16, 80, 100, 25);
        inputmkn.setBounds(124, 80, 100, 25);
        namaminuman.setBounds(16, 113, 100, 25);
        inputmn.setBounds(124, 113, 100, 25);

        hrgmakanan.setBounds(250, 80, 100, 25);
        hmkn.setBounds(350, 80, 100, 25);
        hrgminuman.setBounds(250, 113, 100, 25);
        hmn.setBounds(350, 113, 100, 25);

        btnHitung.setBounds(16, 146, 208, 25);

        hasil.setBounds(16, 179, 100, 25);
        byr.setBounds(124, 179, 100, 25);

    }



//
    void hitung()
    {
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int hrgmkn = Integer.parseInt(hmkn.getText());
                int hrgmn = Integer.parseInt(hmn.getText());


                int hasil = hrgmkn + hrgmn;
                String total = String.valueOf(hasil);

                byr.setText("Rp." + total);

            }
        });
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.LetakanKomponen();
        guiByText.setVisible(true);
        guiByText.hitung();
    }
}

