package id.pinterkom.customlistviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.adi, R.drawable.budi, R.drawable.cindy, R.drawable.dedi, R.drawable.edi};
    String[] names = {"Adi", "Budi", "Cindy", "Dedi", "Edi"};
    String[] jobtitles = {"Vice President", "General Manager", "Secretary", "Programmer", "IT Staff"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new CustomAdapter());
    }

    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.item, null);

            ImageView image = v.findViewById(R.id.image);
            TextView name = v.findViewById(R.id.name);
            TextView jobtitle = v.findViewById(R.id.jobtitle);

            image.setImageResource(images[i]);
            name.setText(names[i]);
            jobtitle.setText(jobtitles[i]);

            return v;
        }
    }
}