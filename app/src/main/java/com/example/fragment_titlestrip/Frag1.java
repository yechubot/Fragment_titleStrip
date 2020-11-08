package com.example.fragment_titlestrip;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.telephony.IccOpenLogicalChannelResponse;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class Frag1 extends Fragment {
    Button btn1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_frag1, container, false);
        btn1 = rootView.findViewById(R.id.btn1);
        return rootView;
    }
}