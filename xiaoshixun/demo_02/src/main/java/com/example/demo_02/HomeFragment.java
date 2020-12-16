package com.example.demo_02;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView mRv;
    private RvAdapter rvAdapter;
    private ArrayList<BannerBean.DataBean> ban;
    private ArrayList<JavaBean.ResultsBean> list;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(@NonNull final View itemView) {
        mRv = (RecyclerView) itemView.findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(getContext()));

        ban = new ArrayList<>();
        list = new ArrayList<>();

        rvAdapter = new RvAdapter(getContext(),ban,list);
        mRv.setAdapter(rvAdapter);
        rvAdapter.setOnclik(new RvAdapter.Onclik() {
            @Override
            public void clik(int position) {
                Intent intent = new Intent(getContext(), BlankActivity.class);
               // intent.putExtra("nb",list.get(position).getMp4_url());
                startActivity(intent);
            }
        });

        initData();
    }

    private void initData() {
        new Retrofit.Builder()
                .baseUrl(Apiservice.b)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(Apiservice.class)
                .getBanner()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BannerBean value) {
                        List<BannerBean.DataBean> data = value.getData();
                        ban.addAll(data);
                        rvAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


        new Retrofit.Builder()
                .baseUrl(Apiservice.a)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(Apiservice.class)
                .getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<JavaBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(JavaBean value) {
                        List<JavaBean.ResultsBean> results = value.getResults();
                        list.addAll(results);
                        rvAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
