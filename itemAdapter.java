package com.tankarjian.it212n.testing;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.Locale;

// Step 1： Inherit from ArrayAdapter class
// Step 2: Use quick fix(Alt-Enter) to fix the error by choosing "Create constructor matching super"
// Step 3: Choose the constructor that has following list of parameters (Context, int ,int ,Object)
// Step 4: Override getView(int, View, ViewGroup) method
// Step 5: Modify getView() method as per your requirements
// Step 6: Modify the constructor to pass in the type of array instead of using the default "Object[]"

public class itemAdapter extends ArrayAdapter {
    public itemAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get hold of current element in the array
        // the element is of BidItem data type and must be casted to such type
        Item items = (Item) getItem(position);

        // get hold of an item in list

        View view = super.getView(position, convertView, parent);
        // find the imageview in the item
        ImageView image =  (ImageView) view.findViewById(R.id.firstPattyImage);
        image.setImageResource(items.getImage());

        // find the title view in the item
        TextView text = (TextView) view.findViewById(R.id.pattyTitle);
        text.setText(items.getTitle());


        // find the price view in the item
        text = view.findViewById(R.id.perPattyPrice);
        String price = String.format(Locale.ENGLISH, "%.2f", items.getPrice());
        text.setText(price);

        return view;
    }
}

