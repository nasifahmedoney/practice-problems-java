package com.nasifahmed;

public class phones {
    private Android android;
    private Windows windows;

    public phones(Android android, Windows windows) {
        this.android = android;
        this.windows = windows;
    }

    public Android getAndroid() {
        return android;
    }

    public Windows getWindows() {
        return windows;
    }

    public String androidDeviceName()
    {
        return android.getModel();
    }
}
