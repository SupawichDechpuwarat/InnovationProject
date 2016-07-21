package com.example.tni.innovationproject;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fr = new FragmentSlider();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fr);
        fragmentTransaction.commit();


        View btnShop = findViewById(R.id.shop_button);
        btnShop.setOnClickListener(this);

        View btnSlider = findViewById(R.id.slider_button);
        btnSlider.setOnClickListener(this);

    }

    public void onClick(View view){
        Fragment fragment;
        switch (view.getId()){
            case R.id.shop_button:
                fragment = new FragmentShoplist();
                break;

            default:
                fragment = new FragmentSlider();
                break;
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fragment);
        fragmentTransaction.commit();
    }

    public void goShopPromotion(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.buttonMC:
                intent = new Intent(this,MacDonald.class);
                break;

            case R.id.buttonMK:
                intent = new Intent(this,MK.class);
                break;

            case R.id.buttonYayoi:
                intent = new Intent(this,Yayoi.class);
                break;

            case R.id.buttonKFC:
                intent = new Intent(this,KFC.class);
                break;

            case R.id.buttonBk:
                intent = new Intent(this,BurgerKing.class);
                break;

            case R.id.button_bbq:
                intent = new Intent(this,BBQ.class);
                break;

            case R.id.button_fuji:
                intent = new Intent(this,Fuji.class);
                break;


            default:
                intent = new Intent(this,MainActivity.class);
                break;
        }

        startActivity(intent);

    }


}
