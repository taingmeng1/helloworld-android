package com.candroid.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_thumbnail)
    ImageView mThumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        Glide.with(this)
                .load("https://static.pexels.com/photos/247917/pexels-photo-247917.jpeg")
                .into(mThumbnail);
    }

    @OnClick(R.id.home_thumbnail)
    public void onThumbnailClick() {
        launchMainActivity();
    }

    public void launchMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
