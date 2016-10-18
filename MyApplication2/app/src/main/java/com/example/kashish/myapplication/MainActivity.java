package com.example.kashish.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v7.app.Activity;
//import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  {


    Button button,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);
            }
            });
        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:19.076,72.777"));
                Intent choose=Intent.createChooser(intent,"maps");
                startActivity(choose);
            }});
        b2=(Button)findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent= new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("market:///details?id=livio.pack.lang.en_US&hl=en"));
                    Intent choose=Intent.createChooser(intent,"market");
                    startActivity(choose);
                }

                });
        b3=(Button)findViewById(R.id.button4);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    Intent intent=new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra(Intent.EXTRA_EMAIL,"agarwalkashish.123@gmail.com");
                    intent.putExtra(Intent.EXTRA_SUBJECT,"HI");
                    intent.putExtra(Intent.EXTRA_TEXT,"I'm speakin from inside ur app");
                    intent.setType("message/rfc822");
                    Intent choose=Intent.createChooser(intent,"market");
                    startActivity(choose);

                }

            });
        b4=(Button)findViewById(R.id.button5);
        b4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);

                }

                });


        Log.d("MainActivity","Hello World!");
    }


    }

