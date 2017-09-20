package com.example.antony.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by antony on 9/20/17.
 */

public class IOSSwipeListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ios_swipe_list, container);
        MainActivity activity = (MainActivity) getActivity();
        if (activity == null) return view;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ios_list_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(new IOSSwipeAdapter());

        return view;
    }

    private class IOSSwipeAdapter extends RecyclerView.Adapter<IOSSwipeAdapter.ViewHolder> {
        private Random random;
        private List<String> randomItems = new ArrayList<>();

        IOSSwipeAdapter() {
            random = new Random();
            randomItems = new ArrayList<>();
            for (int i = 0; i < 50; i++) {
                randomItems.add(String.valueOf(random.nextInt()));
            }
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            ViewHolder(View itemView) {
                super(itemView);
            }
        }

        @Override
        public IOSSwipeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(getActivity()).inflate(R.layout.item_ios_swipe, parent, false));
        }

        @Override
        public void onBindViewHolder(IOSSwipeAdapter.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return randomItems.size();
        }
    }

}
