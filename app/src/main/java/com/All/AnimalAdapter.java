package com.All;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<Animal>
{
    public AnimalAdapter(Context context, ArrayList<Animal>users) { super(context, 0, users); }

    @SuppressLint("ViewHolder")
    @Override @NonNull public View getView(int index, View view, @NonNull ViewGroup view_group)
    {
        Animal animal=getItem(index);

        view=LayoutInflater.from(getContext()).inflate(R.layout.imagetext, view_group, false);
        ImageView image=view.findViewById(R.id.image);
        TextView name=view.findViewById(R.id.name);

        assert animal!=null;
        image.setImageResource(animal.getImage_id());
        name.setText(animal.getName());
        return view;
    }
}