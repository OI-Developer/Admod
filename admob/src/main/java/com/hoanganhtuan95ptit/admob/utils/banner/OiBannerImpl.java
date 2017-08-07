package com.hoanganhtuan95ptit.admob.utils.banner;

import android.app.Activity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.hoanganhtuan95ptit.admob.Admob;

/**
 * Created by HOANG ANH TUAN on 8/1/2017.
 */

class OiBannerImpl implements OiBanner {

    private AdView mAdView;
    private Activity activity;
    private int bannerId;

    OiBannerImpl(OiBannerBuilder builder) {
        this.mAdView=builder.mAdView;
        this.activity=builder.activity;
        this.bannerId=builder.bannerId;

        execute();
    }

    private void execute() {

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice(Admob.testDeviceId)
                .build();
        mAdView.loadAd(adRequest);
    }
}
