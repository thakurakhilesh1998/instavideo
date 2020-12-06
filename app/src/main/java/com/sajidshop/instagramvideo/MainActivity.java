package com.sajidshop.instagramvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.allattentionhere.autoplayvideos.AAH_CustomRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> videoList;
    AAH_CustomRecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoList=new ArrayList<>();
        recyclerView=findViewById(R.id.rv_home);
        videoList.add("http://162.0.224.100/Quila2/image/04122020073732_277.mp4");
        videoList.add("http://162.0.224.100/Quila2/image/23112020062555VIDEO_20201123_115542.mp4");
        videoList.add("http://162.0.224.100/Quila2/image/28112020063057VIDEO_20201128_193009.mp4");
        videoList.add("http://162.0.224.100/Quila2/image/29112020045435VIDEO_20201129_222419.mp4");
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.smoothScrollBy(0,1);
        recyclerView.smoothScrollBy(0,-1);
        recyclerView.setVisiblePercent(50);
        recyclerView.setActivity(this);
        MyVideosAdapter adapter=new MyVideosAdapter(this,videoList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        recyclerView.stopVideos();
    }
    @Override
    protected void onResume() {
        super.onResume();
        recyclerView.playAvailableVideos(0);
    }
}
