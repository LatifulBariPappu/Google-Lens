package com.example.googlelensappllication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView caputureIV;
    private Button snapBtn,getSearchResultsBtn;
    private RecyclerView resultsRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caputureIV=findViewById(R.id.image);
        snapBtn=findViewById(R.id.BtnSnap);
        getSearchResultsBtn=findViewById(R.id.BtnResults);
        resultsRV=findViewById(R.id.RVSearchResult);

    }
}