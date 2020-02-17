package com.example.filter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    LinearLayout linearLayout;
    ImageView image;
    boolean flag = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


     image = (ImageView) findViewById( R.id.image );
     linearLayout = (LinearLayout) findViewById( R.id.linearlayout1 );



     image.setOnClickListener( new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             if (flag) {
                 linearLayout.setVisibility( View.VISIBLE );
                 flag = false;
             } else {
                 linearLayout.setVisibility( View.INVISIBLE );
                 flag = true;
             }
         }
     } );
    }

}
