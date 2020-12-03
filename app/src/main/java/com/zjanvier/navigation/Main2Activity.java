package com.zjanvier.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textView2;
    private Button boutonRetour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        boutonRetour=findViewById(R.id.boutonRetour);

        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            //String message=extras.getString("Message2");
            int monInt=extras.getInt("Message3");
            textView2.setText(String.valueOf(monInt));
        }

        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code ici
                Intent returnIntent=getIntent();
                returnIntent.putExtra("returnData", "Bien entendu !");
                setResult(RESULT_OK,returnIntent);
                finish();

            }
        });
    }
}
