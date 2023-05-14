package com.example.companionapp.ui.faculty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.companionapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class FacultyFragment extends Fragment {
    private RecyclerView csDepartment, lawDepartment, businessDepartment,placementDepartment, examDepartment;
    private LinearLayout csNoData, lawNoData, businessNoData, placementNoData ,examNoData;
    private List<TeacherData> list1,list2,list3,list4,list5;

    private TeacherAdapter adapter;
    private DatabaseReference reference,dbRef;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faculty, container, false);
        csDepartment = view.findViewById(R.id.csDepartment);
        lawDepartment = view.findViewById(R.id.lawDepartment);
        businessDepartment = view.findViewById(R.id.businessDepartment);
        placementDepartment = view.findViewById(R.id.placementDepartment);
        examDepartment = view.findViewById(R.id.examDepartment);


        csNoData = view.findViewById(R.id.csNoData);
        lawNoData = view.findViewById(R.id.lawNoData);
        businessNoData = view.findViewById(R.id.businessNoData);
        placementNoData = view.findViewById(R.id.placementNoData);
        examNoData = view.findViewById(R.id.examNoData);

        reference = FirebaseDatabase.getInstance().getReference().child("teacher");

        csDepartment();
        lawDepartment();
        businessDepartment();
        placementDepartment();
        examDepartment();


        return view;
    }

    private void csDepartment() {
        dbRef = reference.child("Computer Science");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list1 =  new ArrayList<>();
                if(!dataSnapshot.exists()){
                    csNoData.setVisibility(View.VISIBLE);
                    csDepartment.setVisibility(View.GONE);

                }else{
                    csNoData.setVisibility(View.GONE);
                    csDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list1.add(data);

                    }
                    csDepartment.setHasFixedSize(true);
                    csDepartment.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list1, getContext());
                    csDepartment.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void lawDepartment() {
        dbRef = reference.child("Law");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list2 =  new ArrayList<>();
                if(!dataSnapshot.exists()){
                    lawNoData.setVisibility(View.VISIBLE);
                    lawDepartment.setVisibility(View.GONE);

                }else{
                    lawNoData.setVisibility(View.GONE);
                    lawDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list2.add(data);

                    }
                    lawDepartment.setHasFixedSize(true);
                    lawDepartment.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list2, getContext());
                    lawDepartment.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void businessDepartment() {
        dbRef = reference.child("Business");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list3 =  new ArrayList<>();
                if(!dataSnapshot.exists()){
                    businessNoData.setVisibility(View.VISIBLE);
                    businessDepartment.setVisibility(View.GONE);

                }else{
                    businessNoData.setVisibility(View.GONE);
                    businessDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list3.add(data);

                    }
                    businessDepartment.setHasFixedSize(true);
                    businessDepartment.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list3, getContext());
                    businessDepartment.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void placementDepartment() {
        dbRef = reference.child("Placement Cell");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list4 =  new ArrayList<>();
                if(!dataSnapshot.exists()){
                    placementNoData.setVisibility(View.VISIBLE);
                    placementDepartment.setVisibility(View.GONE);

                }else{
                    placementNoData.setVisibility(View.GONE);
                    placementDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list4.add(data);

                    }
                    placementDepartment.setHasFixedSize(true);
                    placementDepartment.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4, getContext());
                    placementDepartment.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void examDepartment() {
        dbRef = reference.child("Exam Cell");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list5 =  new ArrayList<>();
                if(!dataSnapshot.exists()){
                    examNoData.setVisibility(View.VISIBLE);
                    examDepartment.setVisibility(View.GONE);

                }else{
                    examNoData.setVisibility(View.GONE);
                    examDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list5.add(data);

                    }
                    examDepartment.setHasFixedSize(true);
                    examDepartment.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list5, getContext());
                    examDepartment.setAdapter(adapter);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getContext(), databaseError.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}