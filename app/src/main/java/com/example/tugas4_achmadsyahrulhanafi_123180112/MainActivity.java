package com.example.tugas4_achmadsyahrulhanafi_123180112;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navbar;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE);
        Boolean check = sharedPreferences.getBoolean("logged", false);
        if(!check) {
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
            finish();
        }

        else {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            navbar = findViewById(R.id.main_navbar);
            navbar.setOnNavigationItemSelectedListener(this);
            navbar.setSelectedItemId(R.id.ic_home);
            loadFragment(new HomeFragment());
        }
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.ic_home:
                fragment = new HomeFragment();
                break;
            case R.id.ic_history:
                fragment = new HistoryFragment();
                break;
            case R.id.ic_profil:
                fragment = new ProfilFragment();
                break;
        }
        return loadFragment(fragment);
    }
}