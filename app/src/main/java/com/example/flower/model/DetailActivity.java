package com.example.flower.model;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.flower.DetailFragment;
import com.example.flower.R;
import com.example.flower.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

   ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Flower flower = (Flower) getIntent().getSerializableExtra("flower");
        DetailFragment fragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("flower " , flower);
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment)
                .commit();



    }




}