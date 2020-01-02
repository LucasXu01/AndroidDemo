package com.netease.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.netease.databinding.BR;

public class UserInfo {

    //第一种方法  注意这个要给UserInfo对象extends BaseObservable
//    private String username;
//    private String password;
//
//    @Bindable
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//        notifyPropertyChanged(BR.username);
//    }
//
//    @Bindable
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//        notifyPropertyChanged(BR.username);
//    }

    //第二种方法  简洁
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

}
