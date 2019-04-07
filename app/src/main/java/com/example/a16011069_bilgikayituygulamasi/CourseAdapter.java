package com.example.a16011069_bilgikayituygulamasi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder>
{
    ArrayList<Course> mCourseList;
    LayoutInflater inflater;

    public CourseAdapter(Context context, ArrayList<Course> course)
    {
        inflater = LayoutInflater.from(context);
        this.mCourseList = course;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = inflater.inflate(R.layout.item_course_card, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        Course selectedCourse = mCourseList.get(position);
        holder.setData (selectedCourse, position);
    }

    @Override
    public int getItemCount()
    {
        return mCourseList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView tvName, tvGrade;

        public MyViewHolder (View itemView)
        {
            super(itemView);
            tvName= itemView.findViewById(R.id.tvCardName);
            tvGrade = itemView.findViewById(R.id.tvCardGrade);
        }

        public void setData (Course selectedProduct, int position)
        {
            this.tvName.setText(selectedProduct.getName());
            this.tvGrade.setText(selectedProduct.getGrade());
        }


        @Override
        public void onClick(View v)
        {

        }
    }
}