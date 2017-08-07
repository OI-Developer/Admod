package com.hoanganhtuan95ptit.admob;

import android.app.Activity;

import com.hoanganhtuan95ptit.admob.utils.banner.OiBannerBuilder;
import com.hoanganhtuan95ptit.admob.utils.interstitial.OiInterstitialAdBuilder;

/**
 * Created by HOANG ANH TUAN on 8/1/2017.
 */

public class Admob {
    public static String testDeviceId="";
    private Activity activity;

    public static void initialize(String testDeviceId) {
        Admob.testDeviceId = testDeviceId;
    }

    public static Admob with(Activity activity) {
        return new Admob(activity);
    }

    private Admob(Activity activity) {
        this.activity = activity;
    }

    public OiInterstitialAdBuilder asInterstitialAd() {
        return OiInterstitialAdBuilder.with(activity);
    }

    public OiBannerBuilder asBanner() {
        return OiBannerBuilder.with(activity);
    }

}
