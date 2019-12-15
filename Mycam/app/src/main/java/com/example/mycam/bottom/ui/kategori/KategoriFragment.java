package com.example.mycam.bottom.ui.kategori;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mycam.R;


public class KategoriFragment extends Fragment {

    private KategoriViewModel kategoriViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kategoriViewModel =
                ViewModelProviders.of(this).get(KategoriViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kategori, container, false);
        return root;
    }
}