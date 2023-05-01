package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.flower.model.DetailActivity;
import com.example.flower.model.Flower;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements flowerClick{
    RecyclerView recyclerView;
    FlowerAdapter adapter;
    ArrayList<Flower> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        fillList();
        initAdapter();

    }

    private void initViews(){
        recyclerView = findViewById(R.id.recyclerView);

    }
    private void fillList() {
        arrayList = new ArrayList<>();

        arrayList.add(new Flower(R.drawable.img,"Rose " , "red" , "250"));
        arrayList.add(new Flower(R.drawable.img,"Rose " , "red" , "250"));
        arrayList.add(new Flower(R.drawable.img,"Rose " , "red" , "250"));
    }

    private void initAdapter(){
        adapter = new FlowerAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void flowerClicked(Flower flower) {
        Intent intent = new Intent(this , DetailActivity.class);
        intent.putExtra("name ", flower.getName());
        intent.putExtra("color", flower.getColor());
        intent.putExtra("sum", flower.getSum());
        intent.putExtra("image",flower.getImage());
        startActivity(intent);

    }
}