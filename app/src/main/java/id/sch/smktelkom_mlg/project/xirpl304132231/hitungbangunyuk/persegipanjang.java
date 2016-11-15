package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        etLebar = (EditText)findViewById(R.id.editTextLebar);
        etPanjang = (EditText) findViewById(R.id.editTextPanjang);
        tvHasil = (TextView) findViewById(R.id.textView3);

        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doHitung();
            }

            private void doHitung()
            {
                int a = etLebar.getText().toString().isEmpty()?0:Integer.parseInt(etLebar.getText().toString());
                int b = etPanjang.getText().toString().isEmpty()?0:Integer.parseInt(etPanjang.getText().toString());

                //luas
                tvHasil.setText(a*b);
                //keliling
                tvHasil.setText(a+b+a+b);
            }
        });

        findViewById(R.id.buttonBackPersegipanjang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
