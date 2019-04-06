package com.example.a16011069_bilgikayituygulamasi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    ArrayList<Course> mCourseList;
    LayoutInflater inflater;

    public CourseAdapter(Context context, ArrayList<Course> course) {
        inflater = LayoutInflater.from(context);
        this.mCourseList = course;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_course_card, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Course selectedProduct = mCourseList.get(position);
        holder.setData(selectedProduct, position);

    }

    @Override
    public int getItemCount() {
        return mCourseList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView productName, productDescription;
        ImageView productImage, deleteproduct;

        public MyViewHolder(View itemView) {
            super(itemView);
            productName = (TextView) itemView.findViewById(R.id.productName);
            productDescription = (TextView) itemView.findViewById(R.id.productDescription);
            productImage = (ImageView) itemView.findViewById(R.id.productImage);
            deleteproduct = (ImageView) itemView.findViewById(R.id.deleteproduct);
            deleteproduct.setOnClickListener(this);

        }

        public void setData(Course selectedProduct, int position) {

            this.productName.setText(selectedProduct.getProductName());
            this.productDescription.setText(selectedProduct.getProductDescription());
            this.productImage.setImageResource(selectedProduct.getImageID());


        }


        @Override
        public void onClick(View v) {


        }


    }
}