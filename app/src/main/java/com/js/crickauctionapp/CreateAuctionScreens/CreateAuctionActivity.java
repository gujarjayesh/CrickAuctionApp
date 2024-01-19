package com.js.crickauctionapp.CreateAuctionScreens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.icspl.crickauctionapp.R;
import com.js.crickauctionapp.CreateAuctionScreens.Fragments.CreateAuctionFragment;

public class CreateAuctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_auction);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.create_auct_container,new CreateAuctionFragment()).commit();
    }
}