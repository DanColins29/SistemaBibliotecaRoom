package br.multitask.sistemabibliotecaroom.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.multitask.sistemabibliotecaroom.R;

public class MainActivity extends Activity {

    Button student = findViewById(R.id.btn_student);
    Button library = findViewById(R.id.btn_library);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UserActivity.class));
            }
        });
    }
}
