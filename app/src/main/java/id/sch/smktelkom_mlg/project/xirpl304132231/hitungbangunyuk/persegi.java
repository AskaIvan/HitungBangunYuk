package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Icha on 16-Nov-16.
 */
public class persegi extends AppCompatActivity {
    EditText etSisi;
    TextView tvHasil;
    Button buttonPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        etSisi = (EditText) findViewById(R.id.editTextSisi);
        tvHasil = (TextView) findViewById(R.id.tvHasilPersegi);
        buttonPersegi = (Button) findViewById(R.id.buttonHitungPersegi);

        findViewById(R.id.buttonHitungPersegi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });
    }

    private void doHitung() {
        if (isValid()) {
            int a = etSisi.getText().toString().isEmpty() ? 0 : Integer.parseInt(etSisi.getText().toString());

            //luas dan keliling
            tvHasil.setText("Luas Persegi = " + (a * a) + "\n" + "Keliling Persegi = " + (4 * a));

        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etSisi.getText().toString();

        if (a.isEmpty()) {
            etSisi.setError("Sisi belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etSisi.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etSisi.setError(null);
        }
        return valid;
    }
}