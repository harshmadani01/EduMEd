package com.appspouch.edumed.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appspouch.edumed.Interface.CategoryItemClick;
import com.appspouch.edumed.R;

import org.w3c.dom.Text;

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textView_disease;

    public CategoryItemClick categoryItemClick;

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_disease = itemView.findViewById(R.id.list_disease_name);
        itemView.setOnClickListener(this);
    }

    public void ClickMe(CategoryItemClick categoryItemClick)
    {
        this.categoryItemClick = categoryItemClick;
    }

    @Override
    public void onClick(View v) {
        categoryItemClick.onClick(v,false);
    }
}
