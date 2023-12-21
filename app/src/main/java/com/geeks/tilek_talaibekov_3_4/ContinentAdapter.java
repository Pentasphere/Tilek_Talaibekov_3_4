package com.geeks.tilek_talaibekov_3_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.tilek_talaibekov_3_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinetViewHolder> {
    private ArrayList<ContinentModel> continentList;
    private OnItemClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentList, OnItemClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinetViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinetViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ContinetViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private ImageView imgContinent;
    private ItemContinentBinding binding;

    public ContinetViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
        imgContinent = itemView.findViewById(R.id.img_map);
        this.binding = binding;
    }

    public void onBind(ContinentModel continent){
        tvName.setText(continent.getName());
        Glide.with(binding.imgMap).load(continent.getMap()).into(binding.imgMap);
    }
}
