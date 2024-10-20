package com.mathematical_reasoning.raz_mat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> mTitles;
    private List<Integer> mIconsLeft;    // Íconos de la izquierda
    private int[] mIconsRight1;  // Primer ícono de la derecha (libro)
    private int[] mIconsRight2;  // Segundo ícono de la derecha (resolver)
    private Context mContext;

    // Constructor que incluye los íconos de la derecha
    public MyAdapter(Context context, List<String> titles, List<Integer> iconsLeft, int[] iconsRight1, int[] iconsRight2) {
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
                .inflate(R.layout.l1_layout_main_item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Establece el título y el ícono de la izquierda
        holder.mTextView.setText(mTitles.get(position));
        holder.mImageViewLeft.setImageResource(mIconsLeft.get(position));
        int color =  R.color.azulPersonalizado;
        // Aplicar el filtro de color a los íconos de la izquierda
        holder.mImageViewLeft.setColorFilter(ContextCompat.getColor(mContext,color));

        // Configura los íconos de la derecha (botón de libro y botón de resolver)
        holder.mButtonBook.setImageResource(mIconsRight1[position]);
        holder.mButtonResolver.setImageResource(mIconsRight2[position]);

        // Aplicar el filtro de color a los íconos de la derecha
        holder.mButtonBook.setColorFilter(ContextCompat.getColor(mContext, color));
        holder.mButtonResolver.setColorFilter(ContextCompat.getColor(mContext, color));

        // Manejar eventos de clic en los botones de la derecha
        holder.mButtonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Usa holder.getAdapterPosition() en lugar de "position"
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(mContext, TheoryActivity.class);
                    intent.putExtra("iconResource", mIconsLeft.get(currentPosition)); // Pasar el ícono correspondiente
                    intent.putExtra("title", mTitles.get(currentPosition)); // Pasar el título correspondiente
                    mContext.startActivity(intent); // Iniciar TeoriaActivity
                    if (mContext instanceof Activity) {
                        ((Activity) mContext).overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                }
            }
        });

        holder.mButtonResolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    // Crear un Intent para ir a ProblemasActivity
                    Intent intent = new Intent(mContext, ProblemsActivity.class);

                    // Pasar el título y el ícono del ítem seleccionado si es necesario
                    intent.putExtra("iconResource", mIconsLeft.get(currentPosition));  // Pasar el ícono correspondiente
                    intent.putExtra("title", mTitles.get(currentPosition));
                    intent.putExtra("currentPosition", currentPosition);

                    // Iniciar la actividad de problemas
                    mContext.startActivity(intent);
                    if (mContext instanceof Activity) {
                        ((Activity) mContext).overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mTitles.size();
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
