package com.achraf.sport.cote.swipecarddeck;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Achraf on 01/07/2016.
 */
public class SwipeDeckAdapter extends BaseAdapter {
    private List<SwipeCard> data;
    private Context context;
    LayoutInflater inflater;

    public SwipeDeckAdapter(List<SwipeCard> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null){
            inflater = LayoutInflater.from(context);
            // normally use a viewholder
            v = inflater.inflate(R.layout.test_card, parent, false);
        }
        ((TextView) v.findViewById(R.id.textView2)).setText(data.get(position).getTxt());
        ((ImageView) v.findViewById(R.id.imageSwipe)).setImageBitmap(data.get(position).getImage());

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int item = position;
                Log.i("MainActivity", ""+item);
            }
        });

        return v;
    }
}
