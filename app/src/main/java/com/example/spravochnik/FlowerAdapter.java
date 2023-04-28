package com.example.spravochnik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {


    private final LayoutInflater inflater;
    private final List<Flower> flowers;

    public FlowerAdapter(Context context, List< Flower> flowers) {
        this.inflater = LayoutInflater.from(context);
        this.flowers = flowers;
    }

    @Override
    public FlowerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(FlowerAdapter.ViewHolder holder, int position) {
        Flower flower = flowers.get(position);
        holder.flowerView.setImageResource(flower.getFlowerResource());
        holder.nameView.setText(flower.getName());
        holder.flowerDescriptionView.setText(flower.getFlowerDescription());
        holder.flowerWaterSizeView.setText(flower.getFlowerSize());
    }
    @Override
    public int getItemCount() {
        return flowers.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flowerView;
        final TextView nameView, flowerDescriptionView, flowerWaterSizeView;
        ViewHolder(View view) {
            super(view);
            flowerView = view.findViewById(R.id.flowersResource);
            nameView = view.findViewById(R.id.name);
            flowerDescriptionView = view.findViewById(R.id.flowersDescription);
            flowerWaterSizeView = view.findViewById(R.id.waterflowers);
        }
    }
}