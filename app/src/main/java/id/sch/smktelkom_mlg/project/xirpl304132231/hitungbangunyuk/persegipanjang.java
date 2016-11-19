package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjang extends AppCompatActivity {
    EditText etPanjang;
    EditText etLebar;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        etLebar = (EditText) findViewById(R.id.editTextLebar);
        etPanjang = (EditText) findViewById(R.id.editTextPanjang);
        tvHasil = (TextView) findViewById(R.id.tvHasilPersegiPanjang);

        findViewById(R.id.buttonHitungT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });
    }

    private void doHitung() {
        if (isValid()) {
            int a = etLebar.getText().toString().isEmpty() ? 0 : Integer.parseInt(etLebar.getText().toString());
            int b = etPanjang.getText().toString().isEmpty() ? 0 : Integer.parseInt(etPanjang.getText().toString());

            //luas & Keliling
            tvHasil.setText("Luas :" + (a * b) + "\n" + "Keliling :" + (a + b + a + b));
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etLebar.getText().toString();
        String b = etPanjang.getText().toString();

        if (a.isEmpty()) {
            etLebar.setError("Diagonal 1 belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etLebar.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etLebar.setError(null);
        }
        if (b.isEmpty()) {
            etPanjang.setError("Diagonal 2 belum diisi");
            valid = false;
        } else if (b.length() > 2) {
            etPanjang.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etPanjang.setError(null);
        }
        return valid;
    }
}
