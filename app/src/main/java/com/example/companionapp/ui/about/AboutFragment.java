package com.example.companionapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.companionapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_about, container, false);
        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_cs,"Computer Science","The Department of Computer Science and Engineering focuses to offer world-class teaching learning environment for technical education and research in the field of modern computer science. The department has a unified and dedicated team of faculty members from IITs, NITs, central universities of India and abroad universities with ample knowledge in cutting-edge technologies and researches in the areas Artificial Intelligence, Data Science, Machine Learning, Deep Learning, Data Mining, Cloud Computing, Image Processing, Networks, Cyber Security, High Performance Computing, Complier Design and Computer Graphics. The Department provides not only theoretical knowledge but also, facilitates students to earn practical knowledge through state of the art infrastructure facilities which includes Data Structure lab, Operating System lab, Software Engineering Lab, Web Technology Lab, Artificial Intelligence and Machine Learning Lab, Data Science Lab, Project & Research laboratory. It also has an active collaboration with premium industries, which provides training and internships to the students and motivates them to get placements in dynamite companies such as Infosys, Wipro, TCS, Cognizant, IBM, HCL, Josh Technology, Mind Tree, Cvent, Commvault, etc.,. where they develop hard and soft technologies that we are using every day."));
        list.add(new BranchModel(R.drawable.ic_law,"Law","Galgotias University's School of Law (SOLGU) is a prime example of how strong traditions, state-of-the-art infrastructure, and an excellent curriculum can pave the way for a top-notch educational institution. Established just a decade ago, SOLGU has made significant strides in the legal education landscape of India by providing skill-oriented and industry-relevant programs. The School of Law's focus on producing litigation specialists, corporate lawyers, mediation & arbitration experts, professionals to draft legal instruments, policymakers, researchers, academicians, diplomats, comparative law experts for the burgeoning LPO industry, and others have helped SOLGU gain prominence as one of the best law schools in India."));
        list.add(new BranchModel(R.drawable.ic_business,"Business","Galgotias University's School of Law (SOLGU) is a prime example of how strong traditions, state-of-the-art infrastructure, and an excellent curriculum can pave the way for a top-notch educational institution. Established just a decade ago, SOLGU has made significant strides in the legal education landscape of India by providing skill-oriented and industry-relevant programs. The School of Law's focus on producing litigation specialists, corporate lawyers, mediation & arbitration experts, professionals to draft legal instruments, policymakers, researchers, academicians, diplomats, comparative law experts for the burgeoning LPO industry, and others have helped SOLGU gain prominence as one of the best law schools in India."));

        adapter = new BranchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        Picasso.get()
                .load("https://firebasestorage.googleapis.com/v0/b/companion-app-b9992.appspot.com/o/Notice%2F%5BB%40343eb9jpg?alt=media&token=c3ec94dd-e891-4744-96d0-fc7d0f7b71bd")
                .into(imageView);

        return view;
    }
}