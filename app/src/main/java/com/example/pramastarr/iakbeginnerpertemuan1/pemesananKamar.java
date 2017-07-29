package com.example.pramastarr.iakbeginnerpertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class pemesananKamar extends AppCompatActivity {

    int pembayaran = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan_kamar);

        setTitle("Pemesanan Kamar"); // mengatur judul
    }


    public void pesan(View view){

        // deklarasi dari views
        TextView text_pembayaran = (TextView) findViewById(R.id.text_pembayaran);
        RadioButton radio_kamarBesar = (RadioButton) findViewById(R.id.radio_kamarBesar);
        RadioButton radio_kamarKecil = (RadioButton) findViewById(R.id.radio_kamarKecil);
        CheckBox check_extraBed = (CheckBox) findViewById(R.id.check_extraBed);
        CheckBox check_makanMalam = (CheckBox) findViewById(R.id.check_makanMalam);

        // mengatur radio button
        if (radio_kamarBesar.isChecked()){
            pembayaran += 1000000; // jika kamar besar dipilih, pembayaran ditambah 1000k
        }
        else if (radio_kamarKecil.isChecked()){
            pembayaran = pembayaran + 500000; // jika kamar kecil dipilih, pembayaran ditambah 500k
        }

        // mengatur check box
        if (check_extraBed.isChecked()){
            pembayaran = pembayaran + 150000; // jika extra bed dicentang, pembayaran ditambah 150k
        }
        if (check_makanMalam.isChecked()){
            pembayaran = pembayaran + 100000; // jika makan malam dicentang, pembayaran ditambah 100k
        }

        text_pembayaran.setText("Pembayaran: Rp" + pembayaran); // mencetak jumlah pembayaran di textview
        Toast.makeText(this, "Terima kasih telah memesan kamar kami", Toast.LENGTH_SHORT).show(); // menampilkan Toast (sejenis pesan singkat)

        //pembayaran = 0; // me-reset nilai pembayaran
    }
}
