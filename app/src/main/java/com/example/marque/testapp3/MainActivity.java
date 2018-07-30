package com.example.marque.testapp3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //View variables
    private TextView mfactTextView;
    private Button  mshowFactButton;
    private FactBook factBook = new FactBook();

    //class objects
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Views from layout to variables
        mfactTextView = findViewById(R.id.factTextView);
        mshowFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        mshowFactButton.setOnClickListener(new View.OnClickListener() { //button on click
            @Override
            public void onClick(View v) {
                //update screen with new fact
                mfactTextView.setText(factBook.getFact()); //what each layout object does when clicked
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                mshowFactButton.setTextColor(color);
            }
        });

        Toast.makeText(this,"Activity was created",Toast.LENGTH_SHORT).show(); //will display when app opens
    }
}
