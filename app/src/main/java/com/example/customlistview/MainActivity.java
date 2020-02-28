package com.example.customlistview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[]= {"Hiroshima","Kamakura","Kyoto","Nara","Osaka","Sapporo","Shinjuku","Tokyo"};
    String mDescription[]={"Tokyo1","Tokyo1","Tokyo1","Tokyo1","Tokyo1","Tokyo1","Tokyo1","Tokyo1"};

  //images to be set in array now:-
   int images[] = {R.drawable.hiroshima,R.drawable.kamakura,R.drawable.kyoto,R.drawable.nara,R.drawable.sapporo,R.drawable.shinjuku,R.drawable.tokyo};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        // creating adapter class;;

        MyAdapter adapter = new MyAdapter(this,mTitle, mDescription, images);
        listView.setAdapter(adapter);

    //  setting the items clicked on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo1", Toast.LENGTH_SHORT).show();
                }

                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo2", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo3", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo4", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo5", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo6", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo7", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){

                    Toast.makeText(MainActivity.this, "Tokyo8", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }


   class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]){

            super( c, R.layout.row, R.id.textView1, title);
            this.context =c;
            this.rTitle= title;
            this.rDescription = description;
            this.rImgs = imgs;



        }

       @NonNull
       @Override
       public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

           LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

           View row = layoutInflater.inflate(R.layout.row, parent, false);

           ImageView images = row.findViewById(R.id.image);
           TextView myTitle = row.findViewById(R.id.textView1);
           TextView myDescription = row.findViewById(R.id.textView2);

           // set resources on views

        images.setImageResource(rImgs[position]);
        myTitle.setText(rTitle[position]);
        myDescription.setText(rDescription[position]);


           return row;
       }
   }

}
