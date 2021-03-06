package com.gingold.basisdependency.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gingold.basisdependency.R;
import com.gingold.basislibrary.Base.BasisBaseFragment;
import com.gingold.basislibrary.utils.BasisLogUtils;

/**
 * Test1Fragment
 */

public class Test5Fragment extends BasisBaseFragment {
    @Override
    public View setupViewLayout(LayoutInflater inflater) {
        return inflater.inflate(R.layout.fragment_test5, null);
    }

    @Override
    public void initView(View mBaseView) {
    }

    @Override
    public void listener() {

    }

    @Override
    public void logicDispose() {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        BasisLogUtils.e(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        BasisLogUtils.e(TAG, "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onAttach(Activity activity) {
        BasisLogUtils.e(TAG, "onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BasisLogUtils.e(TAG, "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        BasisLogUtils.e(TAG, "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        BasisLogUtils.e(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onStart() {
        BasisLogUtils.e(TAG, "onStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        BasisLogUtils.e(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        BasisLogUtils.e(TAG, "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        BasisLogUtils.e(TAG, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        BasisLogUtils.e(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        BasisLogUtils.e(TAG, "onDetach");
        super.onDetach();
    }
}
