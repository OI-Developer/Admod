package com.hoanganhtuan95ptit.admob.utils.interstitial;

import android.app.Activity;
import android.support.annotation.StringRes;

import com.google.android.gms.ads.AdListener;

/**
 * Created by HOANG ANH TUAN on 8/1/2017.
 */

public class OiInterstitialAdBuilder {

    Activity activity;
    AdListener adListener;
    int interstitialAdId;

    public static OiInterstitialAdBuilder with(Activity activity) {
        return new OiInterstitialAdBuilder(activity);
    }

    private OiInterstitialAdBuilder(Activity activity) {
        this.activity = activity;
    }

    public OiInterstitialAdBuilder setAdListener(AdListener adListener) {
        this.adListener = adListener;
        return this;
    }

    public OiInterstitialAdBuilder setInterstitialAdId(@StringRes int interstitialAdId) {
        this.interstitialAdId = interstitialAdId;
        return this;
    }

    public OiInterstitialAd builder() {
        return new OiInterstitialAdImpl(this);
    }
}
