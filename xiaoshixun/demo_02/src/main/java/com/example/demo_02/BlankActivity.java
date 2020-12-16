package com.example.demo_02;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yc.video.player.VideoPlayer;
import com.yc.video.ui.view.BasisVideoController;

public class BlankActivity extends AppCompatActivity {

    private VideoPlayer video_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);
        initView();
    }

    private void initView() {
        video_player = (VideoPlayer) findViewById(R.id.video_player);

        BasisVideoController controller = new BasisVideoController(this);
        video_player.setController(controller);

        video_player.setUrl("http://flv3.bn.netease.com/392d81f782b8280203ead8678b98677af2c8b723690da45869e71601d9a7efc2c8b96fedd47d585bbc01ee3374eb54ec5036d6992ee87e53dbbb194f8d4efb9d80165df09d61d9b282aa340f5c11a0891052ccfb264df5373180874bc554ca0e857c9e3bd3a41a6b7614db8166a0fcaf6445da95e64f3877.mp4");
        video_player.start();
    }
}
