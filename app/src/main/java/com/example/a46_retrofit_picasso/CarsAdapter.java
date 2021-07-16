package com.example.a46_retrofit_picasso;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.ViewHolder> {
    private ArrayList<CarsModel> carsModels= new ArrayList<>();
    private Context context;

    public CarsAdapter(Context context, ArrayList<CarsModel>carsModels){
        this.carsModels= carsModels;
        this.context= context;
    }

    @NonNull
    @Override
    public CarsAdapter.ViewHolder onCreateViewHolder(@NonNull
    ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_item_layout , viewGroup,false);
        return new CarsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsAdapter.ViewHolder viewHolder, int i) {
        viewHolder.car_name.setText(carsModels.get(i).getName());
        viewHolder.car_description.setText(carsModels.get(i).getDesc());
        Picasso.get().load(carsModels.get(i).getImage()).into(viewHolder.car_image);
    }

    @Override
    public int getItemCount() {
        return carsModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView car_image;
        private TextView car_name;
        private TextView car_description;
            public ViewHolder(@NonNull View itemView) {
            super(itemView);
            car_image=itemView.findViewById(R.id.car_image);
            car_name=itemView.findViewById(R.id.car_name);
            car_description=itemView.findViewById(R.id.car_description);
        }
    }
}
