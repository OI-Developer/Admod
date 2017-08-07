-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose

-keep, allowobfuscation class com.hoanganhtuan95ptit.admob.Admob
-keepclassmembers, allowobfuscation class * {
    *;
}

-keep class com.hoanganhtuan95ptit.admob.Admob
-keepclassmembernames class com.hoanganhtuan95ptit.admob.Admob {
    public <methods>;
    public <fields>;
}

-keepclassmembernames class com.hoanganhtuan95ptit.admob.utils.banner.OiBannerBuilder {
    public *;
}

-keepclassmembernames class com.hoanganhtuan95ptit.admob.utils.interstitial.OiInterstitialAdBuilder {
    public *;
}