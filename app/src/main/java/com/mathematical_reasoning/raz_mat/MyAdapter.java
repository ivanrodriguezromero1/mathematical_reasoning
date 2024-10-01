package com.mathematical_reasoning.raz_mat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mTitles;
    private int[] mIconsLeft;    // Íconos de la izquierda
    private int[] mIconsRight1;  // Primer ícono de la derecha (libro)
    private int[] mIconsRight2;  // Segundo ícono de la derecha (resolver)
    private Context mContext;

    // Constructor que incluye los íconos de la derecha
    public MyAdapter(Context context, String[] titles, int[] iconsLeft, int[] iconsRight1, int[] iconsRight2) {
        mTitles = titles;
        mIconsLeft = iconsLeft;
        mIconsRight1 = iconsRight1;
        mIconsRight2 = iconsRight2;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Establece el título y el ícono de la izquierda
        holder.mTextView.setText(mTitles[position]);
        holder.mImageViewLeft.setImageResource(mIconsLeft[position]);

        // Aplicar el filtro de color a los íconos de la izquierda
        holder.mImageViewLeft.setColorFilter(ContextCompat.getColor(mContext, R.color.orange));

        // Configura los íconos de la derecha (botón de libro y botón de resolver)
        holder.mButtonBook.setImageResource(mIconsRight1[position]);
        holder.mButtonResolver.setImageResource(mIconsRight2[position]);

        // Aplicar el filtro de color a los íconos de la derecha
        holder.mButtonBook.setColorFilter(ContextCompat.getColor(mContext, R.color.orange));
        holder.mButtonResolver.setColorFilter(ContextCompat.getColor(mContext, R.color.orange));

        // Manejar eventos de clic en los botones de la derecha
        holder.mButtonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Usa holder.getAdapterPosition() en lugar de "position"
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    Toast.makeText(mContext, "Clicked book button: " + mTitles[currentPosition], Toast.LENGTH_SHORT).show();
                }
            }
        });

        holder.mButtonResolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Usa holder.getAdapterPosition() en lugar de "position"
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    Toast.makeText(mContext, "Clicked Resolver button: " + mTitles[currentPosition], Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTitles.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageViewLeft;
        public ImageButton mButtonBook;
        public ImageButton mButtonResolver;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.item_text);
            mImageViewLeft = itemView.findViewById(R.id.item_icon);
            mButtonBook = itemView.findViewById(R.id.button_book); // Botón del libro
            mButtonResolver = itemView.findViewById(R.id.button_resolver); // Botón de resolver
        }
    }
}
