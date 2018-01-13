package com.example.admin.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    EditText edt;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.text1);
        btn=(Button)findViewById(R.id.botton);
        edt=(EditText)findViewById(R.id.plainText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tv.setText("Test Click");
            Toast t = Toast.makeText(
                    getApplicationContext(),
                    edt.getText().toString(),
                    Toast.LENGTH_LONG);

              t.show();


            }
        });
    }
}
