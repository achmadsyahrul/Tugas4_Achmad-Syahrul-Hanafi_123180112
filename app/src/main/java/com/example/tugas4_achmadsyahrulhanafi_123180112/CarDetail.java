package com.example.tugas4_achmadsyahrulhanafi_123180112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CarDetail extends AppCompatActivity {

    ImageView iv_carImage;
    TextView tv_carName, tv_rentalRates, tv_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        iv_carImage = findViewById(R.id.iv_carImage);
        tv_carName = findViewById(R.id.tv_carName);
        tv_rentalRates = findViewById(R.id.tv_rentalRates);
        tv_info = findViewById(R.id.tv_info);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("car_image") && getIntent().hasExtra("car_name") && getIntent().hasExtra("car_rate") && getIntent().hasExtra("info")){
            int carImage = getIntent().getIntExtra("car_image", 0);
            String carName = getIntent().getStringExtra("car_name");
            String rentalRates = getIntent().getStringExtra("car_rate");
            String info = getIntent().getStringExtra("info");

            setDataActivity(carImage, carName, rentalRates, info);
        }
    }

    private void setDataActivity(int carImage, String carName, String rentalRates, String info){
        tv_carName.setText(carName);
        tv_rentalRates.setText(rentalRates);
        iv_carImage.setImageResource(carImage);
        tv_info.setText(info);
    }
}