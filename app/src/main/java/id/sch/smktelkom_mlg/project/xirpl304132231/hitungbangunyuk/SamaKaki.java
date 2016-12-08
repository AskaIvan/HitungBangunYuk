package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SamaKaki extends AppCompatActivity {
    EditText etTinggi;
    EditText etAlas;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sama_kaki);


        etTinggi = (EditText) findViewById(R.id.editTextTinggiSamaKaki);
        etAlas = (EditText) findViewById(R.id.editTextAlasSamaKaki);
        tvHasil = (TextView) findViewById(R.id.tvHasilSamaKaki);

        findViewById(R.id.buttonHitungSamaKaki).setOnClickListener(new View.OnClickListener() {
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
            int c = (int) Math.sqrt(Math.pow((b / 2), 2) + Math.pow(a, 2));
            //luas dan keliling

            tvHasil.setText("Luas :" + ((a * b) / 2) + "\n" + "Keliling :" + (c + c + b));

        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etTinggi.getText().toString();
        String b = etAlas.getText().toString();

        if (a.isEmpty()) {
            etTinggi.setError("Tinggi belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etTinggi.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etTinggi.setError(null);
        }

        if (b.isEmpty()) {
            etAlas.setError("Alas belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etAlas.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etAlas.setError(null);
        }
        return valid;
    }
}
