package com.geeks.tilek_talaibekov_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geeks.tilek_talaibekov_3_4.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    /*private ContinentAdapter adapter;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new FirstFragment())
                    .commit();
        }

    }
}