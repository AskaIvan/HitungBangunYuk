package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Icha on 16-Nov-16.
 */
public class persegi extends AppCompatActivity {
    EditText etSisi;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        etSisi = (EditText) findViewById(R.id.editTextSisi);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonHitungT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }

            private void doHitung() {
                int a = etSisi.getText().toString().isEmpty() ? 0 : Integer.parseInt(etSisi.getText().toString());

                //luas
                int luas = (a * a);
                //keliling
                int keliling = (4 * a);

                tvHasil.setText("Luas Persegi = " + luas + "\n" + "Keliling Persegi = " + keliling);
            }
        });


    }
}