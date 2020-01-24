package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button buttonTop;
    private Button buttonBottom;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);
        index = 0;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(index){
                    case 0:
                        index=2;
                        break;
                    case 2:
                        index=5;
                        break;
                    case 1:
                        index=2;
                        break;
                }
                updateStory();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(index){
                    case 0:
                        index=1;
                        break;
                    case 1:
                        index=3;
                        break;
                    case 2:
                        index=4;
                        break;
                }
                updateStory();
            }
        });

    }

    private void updateStory() {
        int textViewId=0;
        int buttonTopId=0;
        int buttonBottomId=0;
        switch (index){
            case 1:
                textViewId = R.string.T2_Story;
                buttonTopId = R.string.T2_Ans1;
                buttonBottomId = R.string.T2_Ans2;
                break;
            case 2:
                textViewId = R.string.T3_Story;
                buttonTopId = R.string.T3_Ans1;
                buttonBottomId = R.string.T3_Ans2;
                break;
            case 3:
                textViewId = R.string.T4_End;
                break;
            case 4:
                textViewId = R.string.T5_End;
                break;
            case 5:
                textViewId = R.string.T6_End;
                break;
        }

        storyTextView.setText(textViewId);
        if(index<3){
            buttonTop.setText(buttonTopId);
            buttonBottom.setText(buttonBottomId);
        }else{
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }

    }
}
