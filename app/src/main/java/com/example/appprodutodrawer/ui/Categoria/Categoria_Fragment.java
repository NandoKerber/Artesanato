package com.example.appprodutodrawer.ui.Categoria;

import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.appprodutodrawer.MainActivity;
import com.example.appprodutodrawer.Produto.Bolsas;
import com.example.appprodutodrawer.R;
import com.example.appprodutodrawer.ui.home.HomeViewModel;

public class Categoria_Fragment extends Fragment {

    private CategoriaViewModel mViewModel;
    private ImageView Bolsas;
    private ImageView Colares;
    private ImageView Roupas;
    private ImageView Brincos;
    private View mView;
    //private View view;

    //private HomeViewModel homeViewModel;


    public static Categoria_Fragment newInstance() {
        return new Categoria_Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.categoria__fragment, container, false);
        Bolsas=mView.findViewById(R.id.id_bolsas);
        return Bolsas;
    }


       // view = getActivity().findViewById(R.id.id_bolsas);

       // Bolsas.setOnClickListener((View.OnClickListener) this);

       // homeViewModel =
    //ViewModelProviders.of(this).get(HomeViewModel.class);
       // View root = inflater.inflate(R.layout.categoria__fragment, container, false);


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CategoriaViewModel.class);


    }
}


