package com.example.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment {
    public static final String TAG = "RightFragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"onattach111111");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"oncreate111111");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"onactivitycreated111111");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"onstart111111");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"onresume111111");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"onpause111111");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"onstop111111");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG,"ondestroyview111111");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ondestroy111111");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"ondetach111111");
    }
}
