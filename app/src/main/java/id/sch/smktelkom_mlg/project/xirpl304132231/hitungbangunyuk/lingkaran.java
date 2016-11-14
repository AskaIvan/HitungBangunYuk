package id.sch.smktelkom_mlg.project.xirpl304132231.hitungbangunyuk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        findViewById(R.id.buttonbacklingkaran).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
