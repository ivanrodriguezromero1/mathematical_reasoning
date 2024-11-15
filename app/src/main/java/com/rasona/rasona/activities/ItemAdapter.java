package com.rasona.rasona.activities;

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
import com.rasona.rasona.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private static final int NUM_ITEMS_RESTRICTED = 6;
    private final List<String> titles;
    private final List<Integer> iconsLeft;
    private final int[] iconsRight1;
    private final int[] iconsRight2;
    private final Context context;
    private boolean isSubscribed;

    public ItemAdapter(Context context, List<String> titles, List<Integer> iconsLeft, int[] iconsRight1, int[] iconsRight2, boolean isSubscribed) {
        this.titles = titles;
        this.iconsLeft = iconsLeft;
        this.iconsRight1 = iconsRight1;
        this.iconsRight2 = iconsRight2;
        this.context = context;
        this.isSubscribed = isSubscribed;
    }
    public void updateSubscriptionStatus(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
        notifyDataSetChanged();
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
        holder.textView.setText(titles.get(position));
        holder.imageViewLeft.setImageResource(iconsLeft.get(position));
        int color =  R.color.rasonaBlue;
        holder.imageViewLeft.setColorFilter(ContextCompat.getColor(context,color));

        holder.buttonBook.setImageResource(iconsRight1[position]);
        holder.buttonSolve.setImageResource(iconsRight2[position]);

        holder.buttonBook.setColorFilter(ContextCompat.getColor(context, color));
        holder.buttonSolve.setColorFilter(ContextCompat.getColor(context, color));

        if (!isSubscribed && position >= titles.size() - NUM_ITEMS_RESTRICTED) {
            holder.buttonBook.setEnabled(false);
            holder.buttonSolve.setEnabled(false);
            holder.itemView.setAlpha(0.5f);
        } else {
            holder.buttonBook.setEnabled(true);
            holder.buttonSolve.setEnabled(true);
            holder.itemView.setAlpha(1f);
        }

        holder.buttonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(context, TheoryActivity.class);
                    intent.putExtra("resourceIcon", iconsLeft.get(currentPosition));
                    intent.putExtra("title", titles.get(currentPosition));
                    intent.putExtra("currentPosition", currentPosition);

                    context.startActivity(intent);
                    if (context instanceof Activity) {
                        ((Activity) context).overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                }
            }
        });

        holder.buttonSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = holder.getAdapterPosition();
                if (currentPosition != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(context, ProblemsActivity.class);

                    intent.putExtra("resourceIcon", iconsLeft.get(currentPosition));
                    intent.putExtra("title", titles.get(currentPosition));
                    intent.putExtra("currentPosition", currentPosition);

                    context.startActivity(intent);
                    if (context instanceof Activity) {
                        ((Activity) context).overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageViewLeft;
        public ImageButton buttonBook;
        public ImageButton buttonSolve;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_text);
            imageViewLeft = itemView.findViewById(R.id.item_icon);
            buttonBook = itemView.findViewById(R.id.button_book);
            buttonSolve = itemView.findViewById(R.id.button_solve);
        }
    }
}
