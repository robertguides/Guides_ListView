package com.example.guides.guides_listview.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guides.guides_listview.Activity.MainActivity;
import com.example.guides.guides_listview.Model.College;
import com.example.guides.guides_listview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GUIDES on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter{
    Context c;
    List<College> colleges;
    ImageView IMG_1;
    TextView TXT_1, TXT_2;

    public CustomAdapter(Context c, List<College> colleges) {
        this.c = c;
        this.colleges = colleges;
    }


    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout, null);
        IMG_1 = (ImageView) v.findViewById(R.id.IMG1);
        TXT_1 = (TextView) v.findViewById(R.id.TXT1);
        TXT_2 = (TextView) v.findViewById(R.id.TXT2);

        TXT_1.setText(colleges.get(i).getCollege());
        TXT_2.setText(colleges.get(i).getYear());
        IMG_1.setImageResource(colleges.get(i).getLogo());

        return v;
    }
}
