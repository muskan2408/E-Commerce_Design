package com.olacademy.olacademye_learning;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //   session = new SessionManagement(getApplicationContext());
                // Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();

//                if(!SplashScreen.this.session.isLoggedIn())
//                {
                Log.e("TAG", "execterd");
                Intent i=new Intent(SplashScreen.this,SignIn.class);
                startActivity(i);
                finish();


                //   }
//                else{
//                    Intent i=new Intent(SplashScreen.this,MainActivity.class);
//                    startActivity(i);
//                    finish();
//                }

            }
        }, SPLASH_TIME_OUT);
    }
}
