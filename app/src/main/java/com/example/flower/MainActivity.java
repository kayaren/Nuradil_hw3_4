package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.flower.databinding.ActivityMainBinding;
import com.example.flower.model.DetailActivity;
import com.example.flower.model.Flower;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements flowerClick{
    FlowerAdapter adapter;
    ArrayList<Flower> arrayList;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();
        fillList();
        initAdapter();

    }

    private void initViews(){

    }
    private void fillList() {
        arrayList = new ArrayList<>();

        arrayList.add(new Flower(R.drawable.img,"Rose " , "red" , "250"));
        arrayList.add(new Flower(R.drawable.img,"Rose " , "red" , "250"));
        arrayList.add(new Flower(R.drawable.img,"Rose " , "red" , "250"));
    }

    private void initAdapter(){
        adapter = new FlowerAdapter(arrayList,this);
        binding.recyclerView.setAdapter(adapter);

    }

    @Override
    public void flowerClicked(Flower flower) {
        Intent intent = new Intent(this , DetailActivity.class);
        intent.putExtra("flower" , flower);
        startActivity(intent);


    }
}