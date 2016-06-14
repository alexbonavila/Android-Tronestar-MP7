package com.alexbonavila.alumne.tronestar_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by alumne on 14/06/16.
 */
public class Login extends Activity {

    protected Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_mainpage);
        intent = new Intent(this, MainActivity.class);
        final Button button = (Button) findViewById(R.id.Login);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(intent);
            }
        });

    }

}
