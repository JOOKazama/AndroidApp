package com.All;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list_view=findViewById(R.id.recycler_view);

        ArrayList<Animal>array_list_animals=new ArrayList<>();
        array_list_animals.add(new Animal("Lee", R.drawable.image_lee));
        array_list_animals.add(new Animal("Asuka", R.drawable.image_asuka));

        AnimalAdapter animal_adapter=new AnimalAdapter(this, array_list_animals);
        list_view.setAdapter(animal_adapter);
    }
}