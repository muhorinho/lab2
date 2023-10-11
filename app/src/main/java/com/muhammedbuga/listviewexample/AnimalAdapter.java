package com.muhammedbuga.listviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    private int layoutResourceId;

    public AnimalAdapter(Context context, int layoutResourceId, Animal[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        AnimalHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new AnimalHolder();
            holder.pic = (ImageView) row.findViewById(R.id.pic);
            holder.label = (TextView) row.findViewById(R.id.label);

            row.setTag(holder);
        } else {
            holder = (AnimalHolder) row.getTag();
        }

        Animal animal = getItem(position);
        holder.pic.setImageResource(animal.getImageResId());
        holder.label.setText(animal.getName());

        return row;
    }

    static class AnimalHolder {
        ImageView pic;
        TextView label;
    }
}

