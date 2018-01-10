package com.example.matt.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Declare view variables
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign views from layout to variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //update fact on screen
                int newColor = colorWheel.getColor();
                factTextView.setText(factBook.getFact());
                relativeLayout.setBackgroundColor(newColor);
                showFactButton.setTextColor(newColor);
            }
        };

        showFactButton.setOnClickListener(listener);

//        Toast.makeText(this, "Activity Created",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"We are logging from the on create method");
    }
}
