package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Icha on 16-Nov-16.
 */
public class segitiga extends AppCompatActivity {
    EditText etTinggi;
    EditText etAlas;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        etTinggi = (EditText) findViewById(R.id.editTextTinggi);
        etAlas = (EditText) findViewById(R.id.editTextAlas);
        tvHasil = (TextView) findViewById(R.id.tvHasilSegitiga);

        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }


        });

    }

    private void doHitung() {
        if (isValid()) {
            int a = etTinggi.getText().toString().isEmpty() ? 0 : Integer.parseInt(etTinggi.getText().toString());
            int b = etAlas.getText().toString().isEmpty() ? 0 : Integer.parseInt(etAlas.getText().toString());
            //luas
            int luas = (1 / 2 * b * a);
            //keliling
            int c = (int) (Math.pow(b / 2, 2) + Math.pow(a, 2));

            tvHasil.setText("Luas Segitiga = " + luas + "\n" + "Keliling Segitiga = " + (b + 2 * c));
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etTinggi.getText().toString();
        String b = etAlas.getText().toString();

        if (a.isEmpty()) {
            etTinggi.setError("Diagonal 1 belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etTinggi.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etTinggi.setError(null);
        }
        if (b.isEmpty()) {
            etAlas.setError("Diagonal 2 belum diisi");
            valid = false;
        } else if (b.length() > 2) {
            etAlas.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etAlas.setError(null);
        }
        return valid;
    }
}