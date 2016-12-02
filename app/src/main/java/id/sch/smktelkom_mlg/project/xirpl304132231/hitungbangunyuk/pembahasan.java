package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class pembahasan extends AppCompatActivity {

    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembahasan);

        tvHasil = (TextView) findViewById(R.id.tvHasilPembahasan);
        tvHasil.setText("Luas persegi = s * s");
    }
}
