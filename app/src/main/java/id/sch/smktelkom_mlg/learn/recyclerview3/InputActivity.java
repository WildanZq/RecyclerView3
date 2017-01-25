package id.sch.smktelkom_mlg.learn.recyclerview3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        hotel = (Hotel) getIntent().getSerializableExtra(HOTEL);
        if(hotel!=null) {
            setTitle("Edit "+hotel.judul);
            fillData();
        } else {
            setTitle("New Hotel");
        }
    }

    private void fillData() {
        etJudul.setText(hotel.judul);
        etDeskripsi.setText(hotel.deskripsi);
        etDetail.setText(hotel.detail);
        etLokasi.setText(hotel.lokasi);
        uriFoto = Uri.parse(hotel.foto);
        ivFoto.setImageURI(uriFoto);
    }
}
