package com.reactlibrary;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.reactlibrary.AppSignatureHelper;

import java.util.ArrayList;

public class RNAppSignatureHelperModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    public RNAppSignatureHelperModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAppSignatureHelper";
    }

    @ReactMethod
    public void getAppSignatures(Promise promise) {
        try {
            AppSignatureHelper mAppSignatureHelper = new AppSignatureHelper(reactContext);
            ArrayList<String> list = mAppSignatureHelper.getAppSignatures();
            promise.resolve(list);
        }
        catch (Error e) {
            promise.reject(e);
        }
    }
}