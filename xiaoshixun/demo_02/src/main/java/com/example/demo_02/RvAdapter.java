package com.example.demo_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

class RvAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<BannerBean.DataBean> ban;
    private ArrayList<JavaBean.ResultsBean> list;

    public RvAdapter(Context context, ArrayList<BannerBean.DataBean> ban, ArrayList<JavaBean.ResultsBean> list) {
        this.context = context;
        this.ban = ban;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item_a, parent, false);
            return new ViewHolder1(inflate);
        } else {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item_b, parent, false);
            return new ViewHolder2(inflate);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType==1){
            ViewHolder1 holder1 = (ViewHolder1) holder;
            holder1.banner.setImages(ban);
            holder1.banner.setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    BannerBean.DataBean path1 = (BannerBean.DataBean) path;
                    Glide.with(context).load(path1.getImagePath()).into(imageView);
                }
            }).start();
        }else{
            ViewHolder2 holder2 = (ViewHolder2) holder;
            if (ban.size()>0){
                position=position-1;
            }
            Glide.with(context).load(list.get(position).getUrl()).into(holder2.iv);
            int finalPosition = position;
            holder2.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onclik.clik(finalPosition);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        if (ban.size() == 0) {
            return list.size() + 1;
        } else {
            return list.size();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return 1;
        }else{
            return 2;
        }
    }

    public static
    class ViewHolder1 extends RecyclerView.ViewHolder {
        public View rootView;
        public Banner banner;

        public ViewHolder1(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.banner = (Banner) rootView.findViewById(R.id.banner);
        }

    }

    public static
    class ViewHolder2 extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView iv;

        public ViewHolder2(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.iv = (ImageView) rootView.findViewById(R.id.iv);
        }

    }

    interface Onclik{
        void clik(int position);
    }
    Onclik onclik;

    public void setOnclik(Onclik onclik) {
        this.onclik = onclik;
    }
}
