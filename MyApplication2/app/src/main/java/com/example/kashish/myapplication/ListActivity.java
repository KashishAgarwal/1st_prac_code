package com.example.kashish.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends Activity {

    String[] MTitles,MDescriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView list=(ListView)findViewById(R.id.list);
        //setSupportActionBar(toolbar);

                Resources res= getResources();
                MTitles=res.getStringArray(R.array.Title);
                MDescriptions=res.getStringArray(R.array.Description);
                int[] images={R.drawable.chrysanthemum,R.drawable.desert,R.drawable.hydrangeas,R.drawable.jellyfish,R.drawable.koala,R.drawable.lighthouse,R.drawable.tulips};
                kAdapter adapter=new kAdapter(ListActivity.this,MTitles,MDescriptions,images);
                list.setAdapter(adapter);
            }
        }


    class kAdapter extends ArrayAdapter<String>{
        Context context;
        String[]title,desc;
        int[] images;


        kAdapter(Context c, String[] Titles, String[] Descriptions,int[] imagearray){
              super(c,R.layout.single_view,R.id.textView,Titles);
            context=c;
            title=Titles;
            desc=Descriptions;
            images=imagearray;
        }
      public View getView(int pos, View convertview, ViewGroup parent){
          View row;
          LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          if(convertview==null) {
              row = inflater.inflate(R.layout.single_view, parent, false);
              ImageView icons = (ImageView) row.findViewById(R.id.imageView);
              TextView Title = (TextView) row.findViewById(R.id.textView);
              TextView Desc = (TextView) row.findViewById(R.id.textView2);
              icons.setImageResource(images[pos]);
              Title.setText(title[pos]);
              Desc.setText(desc[pos]);

          }
          else{
              row = (View) convertview;
          }
          return row;

      }




}
