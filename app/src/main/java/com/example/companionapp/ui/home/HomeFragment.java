package com.example.companionapp.ui.home;

import static com.smarteist.autoimageslider.SliderAnimations.SIMPLETRANSFORMATION;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.companionapp.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    ViewPager viewPager;
    ImageView map;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.slider);
        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.image_one);
        imageList.add(R.drawable.image_two);
        imageList.add(R.drawable.image_three);
        imageList.add(R.drawable.image_four);
        imageList.add(R.drawable.image_five);
        imageList.add(R.drawable.image_six);
        imageList.add(R.drawable.image_seven);
        imageList.add(R.drawable.image_eight);

        SliderAdp SliderAdp = new SliderAdp(imageList);
        viewPager.setAdapter(SliderAdp);

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openMap();

            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0,0?q=Plot No.2, Sector 17-A Yamuna Expressway, Greater Noida, Gautam Buddh Nagar, Gautam Buddh Nagar,Gautam Buddha Nagar Uttar Pradesh 203201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }


}