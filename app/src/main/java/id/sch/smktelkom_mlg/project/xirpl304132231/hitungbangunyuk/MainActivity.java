package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luas = (RadioButton) findViewById(R.id.radioButton);
        keliling = (RadioButton) findViewById(R.id.radioButton2);

        findViewById(R.id.lingkaran).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,lingkaran.class));
            }
        });
        findViewById(R.id.persegipanjang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,persegipanjang.class));
            }
        });
        findViewById(R.id.ketupat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ketupat.class));
            }
        });
        findViewById(R.id.jajargenjang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, jajargenjang.class));
            }
        });
        findViewById(R.id.persegi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, persegi.class));
            }
        });
        findViewById(R.id.segitiga).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, segitiga.class));
            }
        });
    }
}
