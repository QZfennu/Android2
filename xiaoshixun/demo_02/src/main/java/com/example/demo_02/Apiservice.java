package com.example.demo_02;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Apiservice {
    public String a="https://gank.io/";
    public String b="https://www.wanandroid.com/";

    @GET("banner/json")
    Observable<BannerBean> getBanner();

    @GET("api/data/%E7%A6%8F%E5%88%A9/20/28")
    Observable<JavaBean> getData();


}
