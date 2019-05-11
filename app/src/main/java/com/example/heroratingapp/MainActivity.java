package com.example.heroratingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageView chr_place;
    private TextView rate_value;
    private RatingBar rating_star;
    private Button feedback_Btn;

    Animation char_place_anim,bg_button_animate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chr_place=findViewById(R.id.char_place);
        rate_value=findViewById(R.id.rate_value);
        rating_star=findViewById(R.id.rating);
        feedback_Btn=findViewById(R.id.feedbackBtn);

        char_place_anim= AnimationUtils.loadAnimation(this,R.anim.char_place_animate);
        chr_place.startAnimation(char_place_anim);

        bg_button_animate=AnimationUtils.loadAnimation(this,R.anim.bg_button_animate);
        feedback_Btn.startAnimation(bg_button_animate);

        ///sqlite
        // asyntask
        //mysql
        //admob
        //permission




        rating_star.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String star=String.valueOf((int)(rating_star.getRating()));

                if (star.equals("1"))
                {
                    chr_place.setImageResource(R.drawable.clock);
                    chr_place.startAnimation(char_place_anim);
                    rate_value.setText("One Start");
                    feedback_Btn.startAnimation(bg_button_animate);
                }
                else if (star.equals("2"))
                {
                    chr_place.setImageResource(R.drawable.cloud);
                    chr_place.startAnimation(char_place_anim);
                    rate_value.setText("Two Start");
                    feedback_Btn.startAnimation(bg_button_animate);
                }
                else if (star.equals("3")){
                    chr_place.setImageResource(R.drawable.coffee);
                    chr_place.startAnimation(char_place_anim);
                    rate_value.setText("Three Start");
                    feedback_Btn.startAnimation(bg_button_animate);
                }
                else if (star.equals("4")){
                    chr_place.setImageResource(R.drawable.collar);
                    chr_place.startAnimation(char_place_anim);
                    rate_value.setText("Four Start");
                    feedback_Btn.startAnimation(bg_button_animate);
                }
                else if (star.equals("5")){
                    chr_place.setImageResource(R.drawable.protection);
                    chr_place.startAnimation(char_place_anim);
                    rate_value.setText("Five Start");
                    feedback_Btn.startAnimation(bg_button_animate);
                }
            }
        });



    }
}
