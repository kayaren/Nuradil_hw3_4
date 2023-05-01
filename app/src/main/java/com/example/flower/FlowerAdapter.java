package com.example.flower;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flower.model.Flower;

import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {

    ArrayList<Flower> flowerArrayList;
    flowerClick flowerClick;
    public  FlowerAdapter(ArrayList<Flower> arrayList , flowerClick flowerClick){
        this.flowerArrayList = arrayList;
        this.flowerClick = flowerClick;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlowerViewHolder
                (LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flower,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        holder.onBind(flowerArrayList.get(position));
        holder.imageView.setOnClickListener(view -> {
            flowerClick.flowerClicked(flowerArrayList.get(position));

        });


    }

    @Override
    public int getItemCount() {
        return flowerArrayList.size();
    }

    public class FlowerViewHolder extends RecyclerView.ViewHolder  {
        ImageView imageView;
        TextView textView_name;
        TextView textView_color;
        TextView textView_sum;
        public FlowerViewHolder(@NonNull View itemView) {
            super(itemView);
        }



        public void onBind(Flower flower) {
            imageView = itemView.findViewById(R.id.imageView);
            textView_name = itemView.findViewById(R.id.textView_name);
            textView_color = itemView.findViewById(R.id.textView_color);
            textView_sum = itemView.findViewById(R.id.textView_sum);

            imageView.setImageResource(flower.getImage());
            textView_name.setText(flower.getName());
            textView_color.setText(flower.getColor());
            textView_sum.setText(flower.getSum());


        }
    }
}


