package com.flir.flironeexampleapplication;



import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;



public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCamera(View view) {
        Intent intent = new Intent(this, GLPreviewActivity.class);
        startActivity(intent);
    }

}