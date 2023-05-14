package com.example.companionapp.ui.gallery;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.companionapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class GalleryFragment extends Fragment {

    RecyclerView taskRecycler,independenceRecycler,republicRecycler,sportsRecycler,hackathonRecycler,convoRecycler,examRecycler,unifestRecycler,freshersRecycler,festivalRecycler,otherRecycler;
    GalleryAdapter adapter;

    DatabaseReference reference;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);




        taskRecycler=view.findViewById(R.id.taskRecycler);
        independenceRecycler=view.findViewById(R.id.independenceRecycler);
        republicRecycler=view.findViewById(R.id.republicRecycler);
        sportsRecycler=view.findViewById(R.id.sportsRecycler);
        hackathonRecycler=view.findViewById(R.id.hackathonRecycler);
        convoRecycler = view.findViewById(R.id.convoRecycler);
        examRecycler=view.findViewById(R.id.examRecycler);
        unifestRecycler=view.findViewById(R.id.unifestRecycler);
        freshersRecycler=view.findViewById(R.id.freshersRecycler);
        festivalRecycler=view.findViewById(R.id.festivalRecycler);
        otherRecycler=view.findViewById(R.id.otherRecycler);


        reference = FirebaseDatabase.getInstance().getReference().child("gallery");




        getTaskImage();
        getIndependenceImage();
        getRepublicImage();
        getSportsImage();
        getHackathonsImage();
        getConvoImage();
        getExamImage();
        getUnifestImage();
        getFreshersImage();
        getFestivalImage();
        getOtherImage();



        return view;
    }



    private void getTaskImage() {
        reference.child("Important Tasks");
        reference.addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                List<String> imageList = new ArrayList<>();

                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    HashMap<String, Object> data = (HashMap<String, Object>) snapshot.getValue();
                    String imageUrl = (String) data.get("imageUrl");
                    imageList.add(imageUrl);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                taskRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                taskRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getIndependenceImage() {
        reference.child("Independence Day").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                independenceRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                independenceRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void getRepublicImage() {
        reference.child("Republic Day").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                republicRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                republicRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void getSportsImage() {
        reference.child("Sports Days").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                sportsRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                sportsRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getHackathonsImage() {
        reference.child("Hackathons").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                hackathonRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                hackathonRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getConvoImage() {
        reference.child("Convocation").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                convoRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                convoRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void getExamImage() {
        reference.child("Exam Schedule").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                examRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                examRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getUnifestImage() {
        reference.child("Unifest").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                unifestRecycler.setAdapter(adapter);
                unifestRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getFreshersImage() {
        reference.child("Freshers").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                freshersRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                freshersRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getFestivalImage(){
        reference.child("Festival Celebration").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                festivalRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                festivalRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getOtherImage() {
        reference.child("Other Events").addValueEventListener(new ValueEventListener() {

            List<String> imageList = new ArrayList<>();
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    String data = (String) snapshot.getValue();
                    imageList.add(data);
                }

                adapter = new GalleryAdapter(getContext(), imageList);
                otherRecycler.setLayoutManager(new GridLayoutManager(getContext(), 3));
                otherRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), "Data retrieval cancelled: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }



}