package com.example.quizzapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class aboutme extends Fragment {

    private Button resultHomeBtn;
    private NavController navController;
    private ImageView img,img1,img2,img3;


    public aboutme() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aboutme, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        resultHomeBtn = view.findViewById(R.id.go_home_btn);
        resultHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_aboutme_to_listFragment);
            }
        });

        img = view.findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rohitsingh.netlify.com/"));
                startActivity(Getintent);
            }
        });

        img1 = view.findViewById(R.id.github);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rohitsingh9/projects"));
                startActivity(Getintent);
            }
        });

        img2 = view.findViewById(R.id.reddit);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/user/kempachizarak?utm_medium=android_app&utm_source=share"));
                startActivity(Getintent);
            }
        });

        img3 = view.findViewById(R.id.twitter);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Rohit33379174"));
                startActivity(Getintent);
            }
        });
    }
}
