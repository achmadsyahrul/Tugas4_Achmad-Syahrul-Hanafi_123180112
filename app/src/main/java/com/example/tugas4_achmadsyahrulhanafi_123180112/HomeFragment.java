package com.example.tugas4_achmadsyahrulhanafi_123180112;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    View view;
    private int carImage[] = {R.drawable.avanza, R.drawable.xenia, R.drawable.xpander, R.drawable.jazz, R.drawable.typer};
    private ArrayList<String> carName = new ArrayList<>();
    private ArrayList<String> seats = new ArrayList<>();
    private ArrayList<String> rentalRates = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        getData();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_Home);
        HomeAdapter adapter = new HomeAdapter(carImage, carName, seats, rentalRates, info, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    private void getData() {
        carName.add("Toyota Avanza");
        seats.add("7");
        rentalRates.add("325K");
        info.add("Mobil Toyota Avanza memiliki 7 seater sangat cocok untuk keluarga. Harga sewa 325.000 rupiah per hari. " +
                "Toyota Avanza tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Toyota hadir dalam 8 varian. " +
                "Bicara soal spesifikasi mesin Toyota Avanza, ini ditenagai dua pilihan mesin Bensin berkapasitas 1329 cc. " +
                "Avanza tersedia dengan transmisi Manual and Otomatis tergantung variannya. " +
                "Juga, tergantung pilihan dan jenis bahan bakar, konsumsi BBM Avanza mencapai 14.8 kmpl untuk perkotaan. " +
                "Avanza adalah MPV 7 seater dengan panjang 4190 mm, lebar 1660 mm, wheelbase 2655 mm. serta ground clearance 200 mm.");

        carName.add("Daihatsu Xenia");
        seats.add("7");
        rentalRates.add("300K");
        info.add("Mobil Daihatsu Xenia memiliki 7 seater sangat cocok untuk keluarga. Harga sewa 300.000 rupiah per hari. " +
                "Daihatsu Grand Xenia tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Daihatsu hadir dalam 20 varian. " +
                "Bicara soal spesifikasi mesin Daihatsu Grand Xenia, ini ditenagai dua pilihan mesin Bensin berkapasitas 1496 cc. " +
                "Grand Xenia tersedia dengan transmisi Manual and Otomatis tergantung variannya. " +
                "Grand Xenia adalah MPV 7 seater dengan panjang 4190 mm, lebar 1660 mm, wheelbase 2655 mm. serta ground clearance 200 mm.");

        carName.add("Mitsubishi Xpander");
        seats.add("7");
        rentalRates.add("400K");
        info.add("Mobil Mitsubishi Xpander memiliki 7 seater sangat cocok untuk keluarga. Harga sewa 400.000 rupiah per hari. " +
                "Mitsubishi Xpander tersedia dalam pilihan mesin Bensin di Indonesia MPV baru dari Mitsubishi hadir dalam 20 varian. " +
                "Bicara soal spesifikasi mesin Mitsubishi Xpander, ini ditenagai dua pilihan mesin Bensin berkapasitas 1499 cc. " +
                "Xpander tersedia dengan transmisi Manual and Otomatis tergantung variannya. " +
                "Juga, tergantung pilihan dan jenis bahan bakar, konsumsi BBM Xpander mencapai 10.5 kmpl untuk perkotaan, " +
                "14.5 kmpl saat menjelajah perjalanan luar kota. Xpander adalah MPV 7 seater.");

        carName.add("Honda Jazz");
        seats.add("5");
        rentalRates.add("500K");
        info.add("Mobil Honda Jazz memiliki 5 seater. Mobil ini cocok untuk berpergian dengan pujaan hati lho. Harga sewa 500.000 rupiah per hari. " +
                "Honda Jazz tersedia dalam pilihan mesin Bensin di Indonesia Hatchback baru dari Honda hadir dalam 8 varian. " +
                "Bicara soal spesifikasi mesin Honda Jazz, ini ditenagai dua pilihan mesin Bensin berkapasitas 1497 cc. " +
                "Jazz tersedia dengan transmisi Manual and CVT tergantung variannya. " +
                "Jazz adalah Hatchback 5 seater dengan panjang 4035 mm, lebar 1694 mm, wheelbase 2530 mm.");

        carName.add("Honda Civic Type-R");
        seats.add("5");
        rentalRates.add("2.500K");
        info.add("Mobil Honda Civic Type-R memiliki 5 seater. sangat cocok untuk pamer ke mantan kekasih yang nyianyiain kamu. Harga sewa 2.500.000 rupiah per hari. " +
                "Honda Civic Type R tersedia dalam pilihan mesin Bensin di Indonesia Hatchback baru dari Honda hadir dalam 2 varian. " +
                "Bicara soal spesifikasi mesin Honda Civic Type R, ini ditenagai dua pilihan mesin Bensin berkapasitas 1996 cc. " +
                "Civic Type R tersedia dengan transmisi Manual tergantung variannya. " +
                "Civic Type R adalah Hatchback 5 seater dengan panjang 4557 mm, lebar 2076 mm, wheelbase 2700 mm.");
    }
}