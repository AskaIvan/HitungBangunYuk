package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sembarang extends AppCompatActivity {
    EditText etA;
    EditText etB;
    EditText etC;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sembarang);

        etA = (EditText) findViewById(R.id.editTextA);
        etB = (EditText) findViewById(R.id.editTextB);
        etC = (EditText) findViewById(R.id.editTextC);
        tvHasil = (TextView) findViewById(R.id.tvHasilSembarang);

        findViewById(R.id.buttonHitungSembarang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }
        });
    }

    private void doHitung() {

        if (isValid()) {
            int a = etA.getText().toString().isEmpty() ? 0 : Integer.parseInt(etA.getText().toString());
            int b = etB.getText().toString().isEmpty() ? 0 : Integer.parseInt(etB.getText().toString());
            int c = etC.getText().toString().isEmpty() ? 0 : Integer.parseInt(etC.getText().toString());
            int s = (a + b + c) / 2;
            int d = s * (s - a) * (s - b) * (s - c);
            //luas dan keliling

            tvHasil.setText("Luas :" + (Math.sqrt(d)) + "\n" + "Keliling :" + (a + b + c));

        }
    }

    private boolean isValid() {
        boolean valid = true;

        String a = etA.getText().toString();
        String b = etB.getText().toString();
        String c = etC.getText().toString();

        if (a.isEmpty()) {
            etA.setError("Sisi A belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etA.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etA.setError(null);
        }

        if (b.isEmpty()) {
            etB.setError("Sisi B belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etB.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etB.setError(null);
        }

        if (c.isEmpty()) {
            etC.setError("Sisi C belum diisi");
            valid = false;
        } else if (a.length() > 2) {
            etC.setError("Hanya bisa puluhan");
            valid = false;
        } else {
            etC.setError(null);
        }
        return valid;
    }
}
