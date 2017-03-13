package com.qyp.douyu.lib.utils;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by qianyipeng on 2017/3/13.
 */

public class ParcelableSimpale implements Parcelable{
    protected ParcelableSimpale(Parcel in) {
    }

    public static final Creator<ParcelableSimpale> CREATOR = new Creator<ParcelableSimpale>() {
        @Override
        public ParcelableSimpale createFromParcel(Parcel in) {
            return new ParcelableSimpale(in);
        }

        @Override
        public ParcelableSimpale[] newArray(int size) {
            return new ParcelableSimpale[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
