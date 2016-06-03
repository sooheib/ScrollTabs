package com.vivianaranha.scrolltabs;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vivianaranha on 1/26/16.
 */
public class fragmentA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("FRAGMENT A", "onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("FRAGMENT A","onAttach");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null){
            Log.d("FRAGMENT A", "onCreate - First Time");
        } else {
            Log.d("FRAGMENT A", "onCreate - Next Time");

        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("FRAGMENT A","onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FRAGMENT A","onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FRAGMENT A","onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FRAGMENT A","onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("FRAGMENT A","onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FRAGMENT A","onDestroyView");

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("FRAGMENT A", "onSaveInstanceState");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FRAGMENT A","onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FRAGMENT A","onDetach");

    }

}