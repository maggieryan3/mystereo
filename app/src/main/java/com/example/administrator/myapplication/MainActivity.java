package com.example.administrator.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.administrator.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private ToggleButton powerButton;
    private TextView songName;
    //private ImageView picture;
    private SeekBar volumeControl;
    private TextView vDown;
    private TextView vUp;


    public boolean isOff = false;
    public boolean freqency = false;
    public int AMstation = 530;
    public double FMstation = 88.1;
    public int[] amPresets = {550, 600, 650, 700, 750, 800};
    public double[] fmPresets = {90.9, 92.9, 94.9, 96.9, 98.9, 100.9};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Widgets
        powerButton = (ToggleButton) findViewById(R.id.powerButton);
        songName = (TextView) findViewById(R.id.songName);
        volumeControl = (SeekBar) findViewById(R.id.volume);
        vDown = (TextView) findViewById(R.id.volumeDown);
        vUp = (TextView) findViewById(R.id.volumeUp);
        Button tuner = (Button) findViewById(R.id.tune);
        Button amFm = (Button) findViewById(R.id.radio);
        //radio presets
        Button set1 = (Button) findViewById(R.id.preset1);
        Button set2 = (Button) findViewById(R.id.preset2);
        Button set3 = (Button) findViewById(R.id.preset3);
        Button set4 = (Button) findViewById(R.id.preset4);
        Button set5 = (Button) findViewById(R.id.preset5);
        Button set6 = (Button) findViewById(R.id.preset6);
        //button and toggle listeners
        powerButton.setOnClickListener(new ToggleListener());
        tuner.setOnClickListener(new ButtonListener());
        amFm.setOnClickListener(new ButtonListener());
        set1.setOnClickListener(new ButtonListener());
        set2.setOnClickListener(new ButtonListener());
        set3.setOnClickListener(new ButtonListener());
        set4.setOnClickListener(new ButtonListener());
        set5.setOnClickListener(new ButtonListener());
        set6.setOnClickListener(new ButtonListener());
        //long click listeners
        set1.setOnLongClickListener(new longClickListener());
        set2.setOnLongClickListener(new longClickListener());
        set3.setOnLongClickListener(new longClickListener());
        set4.setOnLongClickListener(new longClickListener());
        set5.setOnLongClickListener(new longClickListener());
        set6.setOnLongClickListener(new longClickListener());
    }

    public class longClickListener implements View.OnLongClickListener
    {
        @Override
        public boolean onLongClick(View v)
        {
            int buttonChoice = v.getId();
            if(buttonChoice == R.id.preset1)
            {
                if(freqency == true)
                {
                    amPresets[0] = AMstation;
                }
                else
                {
                    fmPresets[0] = FMstation;
                }
            }
            if(buttonChoice == R.id.preset2)
            {
                if(freqency == true)
                {
                    amPresets[1] = AMstation;
                }
                else
                {
                    fmPresets[1] = FMstation;
                }
            }
            if(buttonChoice == R.id.preset3)
            {
                if(freqency == true)
                {
                    amPresets[2] = AMstation;
                }
                else
                {
                    fmPresets[2] = FMstation;
                }
            }
            if(buttonChoice == R.id.preset4)
            {
                if(freqency == true)
                {
                    amPresets[3] = AMstation;
                }
                else
                {
                    fmPresets[3] = FMstation;
                }
            }
            if(buttonChoice == R.id.preset5)
            {
                if(freqency == true)
                {
                    amPresets[4] = AMstation;
                }
                else
                {
                    fmPresets[4] = FMstation;
                }
            }
            if(buttonChoice == R.id.preset6)
            {
                if(freqency == true)
                {
                    amPresets[5] = AMstation;
                }
                else
                {
                    fmPresets[5] = FMstation;
                }
            }

            return true;
        }
    }

    public class ButtonListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            int buttonChoice = v.getId();
            if(buttonChoice == R.id.preset1)
            {
                if(freqency == true)
                {
                    AMstation = amPresets[0];
                    songName.setText(AMstation + " kHz AM");
                }
                else
                {
                    FMstation = fmPresets[0];
                    songName.setText(FMstation + " MHz FM");
                }
            }
            if(buttonChoice == R.id.preset2)
            {
                if(freqency == true)
                {
                    AMstation = amPresets[1];
                    songName.setText(AMstation + " kHz AM");
                }
                else
                {
                    FMstation = fmPresets[1];
                    songName.setText(FMstation + " MHz FM");
                }
            }
            if(buttonChoice == R.id.preset3)
            {
                if(freqency == true)
                {
                    AMstation = amPresets[2];
                    songName.setText(AMstation + " kHz AM");
                }
                else
                {
                    FMstation = fmPresets[2];
                    songName.setText(FMstation + " MHz FM");
                }
            }
            if(buttonChoice == R.id.preset4)
            {
                if(freqency == true)
                {
                    AMstation = amPresets[3];
                    songName.setText(AMstation + " kHz AM");
                }
                else
                {
                    FMstation = fmPresets[3];
                    songName.setText(FMstation + " MHz FM");
                }
            }
            if(buttonChoice == R.id.preset5)
            {
                if(freqency == true)
                {
                    AMstation = amPresets[4];
                    songName.setText(AMstation + " kHz AM");
                }
                else
                {
                    FMstation = fmPresets[4];
                    songName.setText(FMstation + " MHz FM");
                }
            }
            if(buttonChoice == R.id.preset6)
            {
                if(freqency == true)
                {
                    AMstation = amPresets[5];
                    songName.setText(AMstation + " kHz AM");
                }
                else
                {
                    FMstation = fmPresets[5];
                    songName.setText(FMstation + " MHz FM");
                }
            }
            if(buttonChoice == R.id.tune && isOff == false)
            {
                if(freqency == true) {
                    if (AMstation == 1700) //max
                    {
                        AMstation = 530; //set back to 530
                        songName.setText(AMstation + " kHz AM");
                    }
                    else
                    {
                        AMstation = AMstation + 10;
                        songName.setText(AMstation + " kHzAM");
                    }
                }
                else
                {
                    if(FMstation == 107.9)
                    {
                        FMstation = 88.1;
                        songName.setText(FMstation + " MHz FM");
                    }
                    else
                    {
                        FMstation = FMstation + .2;
                        FMstation = FMstation * 10;
                        FMstation = Math.round(FMstation);
                        FMstation = FMstation/10;
                        songName.setText(FMstation + " MHz FM");
                    }
                }
            }
            else if(buttonChoice == R.id.radio && isOff == false)
            {
                if(freqency == false)
                {
                    songName.setText(AMstation + " kHz AM");
                    freqency = true; //set to AM
                }
                else
                {
                    songName.setText(FMstation + " MHz FM");
                    freqency = false; //set to FM
                }
            }
        }
    }
    public class ToggleListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if(isOff == false) {
                volumeControl.setBackgroundColor(0xDD101010);
                //picture.setBackgroundColor(0xDD101010);
                powerButton.setBackgroundColor(0xDD101010);
                songName.setBackgroundColor(0xDD101010);
                songName.setTextColor(0xDD101010);
                vUp.setBackgroundColor(0xDD101010);
                vDown.setBackgroundColor(0xDD101010);
                isOff = true;
            }
            else
            {
                volumeControl.setBackgroundColor(0xFF0000FF);
                //picture.setBackgroundColor(0xFF0000FF);
                powerButton.setBackgroundColor(0xFF0000FF);
                songName.setBackgroundColor(0xFF0000FF);
                songName.setTextColor(Color.BLACK);
                vUp.setBackgroundColor(0xFF0000FF);
                vDown.setBackgroundColor(0xFF0000FF);
                isOff = false;
            }
        }
    }

}
