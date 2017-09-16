package com.candroid.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mPhotos;
    private TextView mFollowers;
    private TextView mPosts;
    private ImageView mUnfavorite;

    private int mFollowersCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPhotos = findViewById(R.id.main_photos);
        mFollowers = findViewById(R.id.main_followers);
        mPosts = findViewById(R.id.main_posts);

        mPhotos.setText("2000");
        mFollowers.setText("0");
        mPosts.setText("100");

        mUnfavorite = findViewById(R.id.main_unfavorite);
        mUnfavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFollowersCount--;
                if (mFollowersCount <= 0) {
                    mFollowersCount = 0;
                }
                mFollowers.setText(String.valueOf(mFollowersCount));
            }
        });
    }

    public void onFavoriteClick(View view) {
        mFollowersCount++;
        mFollowers.setText(String.valueOf(mFollowersCount));
    }
}
