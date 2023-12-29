package com.example.btap.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.btap.R;
import com.example.btap.dao.SanPhamDAO;
import com.example.btap.model.SanPham;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SanphamAdapter extends RecyclerView.Adapter<SanphamAdapter.SanPhamViewHolder> {
    private Context context;
    private List<SanPham> sanPhamList;

    public SanphamAdapter(Context context, List<SanPham> sanPhamList) {
        this.context = context;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public SanPhamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.con, parent, false);
        return new SanPhamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SanPhamViewHolder holder, int position) {
        SanPham sanPham = this.sanPhamList.get(position);
        holder.taskName.setText(sanPham.getTenSP());
        holder.taskPrice.setText(sanPham.getGiaTien().toString());
         Picasso picasso= Picasso.get();
         picasso.load(sanPham.getImage())
                .into(holder.taskImage);
    }

    @Override
    public int getItemCount() {
        return sanPhamList.size();
    }
    public static  class SanPhamViewHolder extends RecyclerView.ViewHolder {
        TextView taskName, taskPrice;
        ImageView taskImage;
        public SanPhamViewHolder(View itemView) {
            super(itemView);
            taskName = itemView.findViewById(R.id.task_tensp);
            taskPrice = itemView.findViewById(R.id.task_gia);
            taskImage = itemView.findViewById(R.id.task_image);
        }
    }
}
