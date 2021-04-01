package com.example.tugasrecycleview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder> {

    private ArrayList<Siswa> listSiswa;

    public SiswaAdapter(ArrayList<Siswa> listSiswa) {
        this.listSiswa = listSiswa;
    }

    @NonNull
    @Override
    public SiswaAdapter.SiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_siswa, parent, false);
        return new SiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SiswaAdapter.SiswaViewHolder holder, int position) {
        holder.txtNama.setText(listSiswa.get(position).getNama());
        holder.txtNpm.setText(listSiswa.get(position).getNim());
        holder.txtemail.setText(listSiswa.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return (listSiswa != null) ? listSiswa.size() : 0;
    }

    public class SiswaViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNama, txtNpm, txtNoHp, txtemail;

        public SiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_nim_mahasiswa);
            txtemail = (TextView) itemView.findViewById(R.id.txtemail);
        }
    }
}