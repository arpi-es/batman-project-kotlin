package com.example.project.batman.view.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.project.batman.R;


public class CustomBindingAdapter {
    @BindingAdapter("visibleGone")
    public static void showHide(View view, boolean show) {
        view.setVisibility(show ? View.VISIBLE : View.GONE);
    }



    @BindingAdapter({"bind:image_url"})
    public static void loadImage(ImageView imageView, String url)
    {
//        Picasso.with(imageView.getContext()).load(url).resize(200,200).into(imageView);
//

        Glide.with(imageView.getContext())
                .load(url).apply(new RequestOptions().fitCenter().placeholder(R.drawable.placeholder))
                .into(imageView);

    }
}
