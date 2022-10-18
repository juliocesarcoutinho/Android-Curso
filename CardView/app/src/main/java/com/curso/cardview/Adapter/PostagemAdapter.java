package com.curso.cardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.curso.cardview.R;

public class PostagemAdapter extends RecyclerView.Adapter< PostagemAdapter.MyViewHolder > {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.idNome.setText( "Julio Cesar Coutinho" );
        holder.idHoraPostagem.setText( "#tbt Viagem pra Portugal" );
        holder.imgPostagem.setImageResource( R.drawable.imagem1 );

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView idNome;
        private TextView idHoraPostagem;
        private ImageView imgPostagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            idNome              = itemView.findViewById(R.id.idNome);
            idHoraPostagem      = itemView.findViewById(R.id.idHoraPostagem);
            imgPostagem         = itemView.findViewById(R.id.imgPostagem);
        }

    }

}
