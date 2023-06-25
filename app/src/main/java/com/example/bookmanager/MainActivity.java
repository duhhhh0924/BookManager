package com.example.bookmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToAddFavor(View view) {
        startActivity(new Intent(this, AddFavorActivity.class));
    }
    public void jumpToFavorites(View view) {
        startActivity(new Intent(this, FavoritesActivity.class));
    }
    public void jumpToLibrary(View view) {
        startActivity(new Intent(this, LibraryActivity.class));
    }
}

