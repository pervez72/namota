package com.example.namota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ButtonID);
        editText = findViewById(R.id.EdittextID);
        textView = findViewById(R.id.namota_text);

        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ButtonID){

            makenamota();
        }



        }

    void makenamota(){

        String value=editText.getText().toString();


        if (value.isEmpty()){
            Toast.makeText(this, "Please Enter ", Toast.LENGTH_SHORT).show();
        }

        else{
            int number=Integer.parseInt(value);

            String text="";

            for (int i=1; i<=10; i++){
                text=text+""+number+" X "+i+"="+number*i+"\n";
            }

            textView.setText(text);

        }

    }
}

