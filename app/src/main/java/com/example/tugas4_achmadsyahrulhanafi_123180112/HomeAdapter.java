package com.example.tugas4_achmadsyahrulhanafi_123180112;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{

    private int carImage[];
    private ArrayList<String> carName = new ArrayList<>();
    private ArrayList<String> seats = new ArrayList<>();
    private ArrayList<String> rentalRates = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private HomeFragment context;

    public HomeAdapter(int[] carImage, ArrayList<String> carName, ArrayList<String> seats, ArrayList<String> rentalRates, ArrayList<String> info, HomeFragment context) {
        this.carImage = carImage;
        this.carName = carName;
        this.seats = seats;
        this.rentalRates = rentalRates;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        holder.tv_carName.setText(carName.get(position));
        holder.tv_seats.setText(seats.get(position));
        holder.tv_rentalRates.setText(rentalRates.get(position));
        holder.iv_car.setImageResource(carImage[position]);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CarDetail.class);
                intent.putExtra("car_image", carImage[position]);
                intent.putExtra("car_name", carName.get(position));
                intent.putExtra("car_rate", rentalRates.get(position));
                intent.putExtra("info", info.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return carName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_car;
        TextView tv_carName, tv_seats, tv_rentalRates, tv_info;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_car = itemView.findViewById(R.id.iv_car);
            tv_carName = itemView.findViewById(R.id.tv_carName);
            tv_seats = itemView.findViewById(R.id.tv_seats);
            tv_rentalRates = itemView.findViewById(R.id.tv_rentalRates);
            tv_info = itemView.findViewById(R.id.tv_info);
            linearLayout = itemView.findViewById(R.id.linearLayout);

        }
    }
}
