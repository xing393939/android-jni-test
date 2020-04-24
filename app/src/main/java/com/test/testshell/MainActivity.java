package com.test.testshell;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application app = this.getApplication();

        JniUtils jni = new JniUtils();

        Log.i("demo", this.getClass().getName() + "onCreate : " + jni.getCLanguageString());
        Toast.makeText(this, jni.getCLanguageString(), Toast.LENGTH_SHORT).show();
    }
}
