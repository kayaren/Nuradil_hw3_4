package com.example.flower.model;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.flower.R;

public class DetailActivity extends AppCompatActivity {

    TextView name;
    TextView color;
    TextView breed;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        viewsBind();
        Flower flower = (Flower) getIntent().getSerializableExtra("flower");
        name.setText(flower.getName());
        color.setText(flower.getColor());
        breed.setText(flower.getSum());
        imageView.setImageResource(flower.getImage());


    }
    private void viewsBind() {
        name = findViewById(R.id.Name);
        color = findViewById(R.id.Color);
        breed = findViewById(R.id.sum);
        imageView = findViewById(R.id.Image);
    }


}