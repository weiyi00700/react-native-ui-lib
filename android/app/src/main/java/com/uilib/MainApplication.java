package com.uilib;

import android.support.annotation.Nullable;

import com.cmcewen.blurview.BlurViewPackage;
import com.facebook.react.ReactPackage;
import com.reactnativenavigation.NavigationApplication;
import com.wix.reactnativeuilib.BuildConfig;
import com.wix.reactnativeuilib.highlighterview.HighlighterViewPackage;
import com.wix.reactnativeuilib.textinput.TextInputDelKeyHandlerPackage;
import com.wix.reactnativeuilib.wheelpicker.WheelPickerPackage;
import com.wix.reactnativeuilib.nonclippingview.RNNonClippingViewPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends NavigationApplication {
    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Nullable
    @Override
    public List<ReactPackage> createAdditionalReactPackages() {
        return Arrays.<ReactPackage>asList(
                new TextInputDelKeyHandlerPackage(),
                new BlurViewPackage(),
                new HighlighterViewPackage(),
                new WheelPickerPackage(),
                new RNNonClippingViewPackage()
        );
    }
}
