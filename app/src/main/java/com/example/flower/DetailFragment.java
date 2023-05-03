package com.example.flower;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flower.databinding.FragmentDetailBinding;
import com.example.flower.model.Flower;


public class DetailFragment extends Fragment {
    FragmentDetailBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {

            Flower flower = (Flower) getArguments().getSerializable("flower");
            binding.textName.setText(flower.getName());
        }
    }
}
