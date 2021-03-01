package com.example.tp2;

import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<com.example.tp2.MyAdapter.MyViewHolder> {

    private final ArrayList Etablissements;

    public MyAdapter(ArrayList Etablissements) {
        Log.d("TAG", "MyAdapter: called");
        this.Etablissements = Etablissements;
    }

    @Override
    // retourne le nb total de cellule que contiendra la liste
    public int getItemCount() {
        Log.d("TAG", "getItemCount: called");
        return Etablissements.size();
    }


    @Override
    //crée la vu d'une cellule
    // parent pour créer la vu et viewType pour spécifier  la cellule
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("TAG", "onCreateViewHolder: called");
        //pour créer un laouyt depuis un XML
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    //associe les données aux  vues
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("TAG", "onBindViewHolder: called");
        Etablissement Etab = (Etablissement) Etablissements.get(position);
        Log.d("etabname", Etab.getname());
        holder.name.setText(Etab.getname());
        holder.label.setText(Etab.getlabel());
        holder.img.setImageResource(Etab.getimage());
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView label;
        private final TextView name;
        private final ImageView img;
        private Etablissement currentEtab;

        public MyViewHolder(final View itemView) {
            super(itemView);
            Log.d("TAG", "MyViewHolder: called");
            label = itemView.findViewById(R.id.label);
            name = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.img);
            //quand on click sur l'etablissement
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentEtab = (Etablissement) Etablissements.get(getLayoutPosition());
                    new AlertDialog.Builder(itemView.getContext()).setMessage(currentEtab.getname())
                            .setTitle(currentEtab.getlabel())
                            .show();

                }
            });
        }
    }


}