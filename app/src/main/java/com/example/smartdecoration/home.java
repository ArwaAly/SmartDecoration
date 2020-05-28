package com.example.smartdecoration;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;
public class home extends AppCompatActivity {
    ViewFlipper v_flipper ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        int images[]={R.drawable.p1, R.drawable.p2};
        v_flipper=findViewById(R.id.v_flipper);
        //for looop
        for(int image: images)
        {
            flipperimages(image);
        }
    }
    public void flipperimages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);     //4sec
        v_flipper.setAutoStart(true);
        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}
