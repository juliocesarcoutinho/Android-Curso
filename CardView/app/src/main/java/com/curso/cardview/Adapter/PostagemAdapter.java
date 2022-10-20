package com.curso.cardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.curso.cardview.Model.Postagem;
import com.curso.cardview.R;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter< PostagemAdapter.MyViewHolder > {

    private List<Postagem> postagens;

    public PostagemAdapter(List <Postagem> listaPostagem) {
        this.postagens = listaPostagem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get( position );
        holder.idNome.setText( postagem.getNome() );
        holder.idTituloPostagem.setText( postagem.getPostagem() );
        holder.imgPostagem.setImageResource( postagem.getImagem() );

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView idNome;
        private TextView idTituloPostagem;
        private ImageView imgPostagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            idNome              = itemView.findViewById(R.id.idNome);
            idTituloPostagem     = itemView.findViewById(R.id.idTituloPostagem);
            imgPostagem         = itemView.findViewById(R.id.imgPostagem);
        }

    }

}
