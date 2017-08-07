package com.hoanganhtuan95ptit.admob.utils.banner;

import android.app.Activity;

import com.google.android.gms.ads.AdView;

/**
 * Created by HOANG ANH TUAN on 8/1/2017.
 */

public class OiBannerBuilder {

    AdView mAdView;
    Activity activity;
    int bannerId;

    public static OiBannerBuilder with(Activity activity) {
        return new OiBannerBuilder(activity);
    }

    private OiBannerBuilder(Activity activity) {
        this.activity = activity;
    }

    public OiBannerBuilder setmAdView(AdView mAdView) {
        this.mAdView = mAdView;
        return this;
    }

    public OiBannerBuilder setBannerId(int bannerId) {
        this.bannerId = bannerId;
        return this;
    }

    public OiBanner builder() {
        return new OiBannerImpl(this);
    }
}
