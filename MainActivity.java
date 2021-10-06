package com.tankarjian.it212n.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView value;
    int count= 0 ;

    private static final Item[] DATA = {
            new Item("Chicken Patty",4.00),
            new Item("Chicken Special Patty",5.00),
            new Item("Imported Lamb Patty",8.00),
            new Item("Imported Lamb Special Patty",10.00),

    };

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the custom adapter for BidItem
        // specify to use R.layout.row as the layout
        // and chosen textTitle as the default TextView to use in the layout
        itemAdapter adapter = new itemAdapter(MainActivity.this, R.layout.list_item, R.id.pattyTitle, DATA);

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        value = (TextView) findViewById(R.id.pattyQuantity);
    }

    public void plusSign(View v) {
        count++;
        value.setText("" + count);
    }
    public void minusSign(View v) {
        if (count <=0 ) count = 0;
        else count--;
        value.setText(""+ count);
    }
}
