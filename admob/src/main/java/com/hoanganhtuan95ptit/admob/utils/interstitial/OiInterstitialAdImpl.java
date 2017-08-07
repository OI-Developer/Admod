package com.hoanganhtuan95ptit.admob.utils.interstitial;

import android.app.Activity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.hoanganhtuan95ptit.admob.Admob;

/**
 * Created by HOANG ANH TUAN on 8/1/2017.
 */

class OiInterstitialAdImpl implements OiInterstitialAd {

    private Activity activity;
    private AdListener adListener;
    private int interstitialAdId;

    private InterstitialAd interstitialAd;
    private boolean start = true;

    OiInterstitialAdImpl(OiInterstitialAdBuilder builder) {
        this.activity = builder.activity;
        this.interstitialAdId = builder.interstitialAdId;
        this.adListener = builder.adListener;

        execute();
    }

    private void execute() {
        interstitialAd = new InterstitialAd(activity);
        interstitialAd.setAdUnitId(activity.getString(interstitialAdId));

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice(Admob.testDeviceId)
                .build();
        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                if (adListener != null) adListener.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                if (adListener != null) adListener.onAdFailedToLoad(i);
            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
                if (adListener != null) adListener.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
                if (adListener != null) adListener.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                if (adListener != null) adListener.onAdLoaded();
                show();
            }
        });
    }

    private void show() {
        if (start) {
            start = false;
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    if (interstitialAd.isLoaded()) {
                        interstitialAd.show();
                    }
                }
            });
        }
    }
}
