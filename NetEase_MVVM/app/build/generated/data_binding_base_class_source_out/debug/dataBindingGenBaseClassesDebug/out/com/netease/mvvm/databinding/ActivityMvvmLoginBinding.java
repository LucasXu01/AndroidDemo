package com.netease.mvvm.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netease.mvvm.vm.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMvvmLoginBinding extends ViewDataBinding {
  @Bindable
  protected LoginViewModel mLoginViewModel;

  protected ActivityMvvmLoginBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setLoginViewModel(@Nullable LoginViewModel loginViewModel);

  @Nullable
  public LoginViewModel getLoginViewModel() {
    return mLoginViewModel;
  }

  @NonNull
  public static ActivityMvvmLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_mvvm_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMvvmLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMvvmLoginBinding>inflateInternal(inflater, com.netease.mvvm.R.layout.activity_mvvm_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMvvmLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_mvvm_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMvvmLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMvvmLoginBinding>inflateInternal(inflater, com.netease.mvvm.R.layout.activity_mvvm_login, null, false, component);
  }

  public static ActivityMvvmLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMvvmLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMvvmLoginBinding)bind(component, view, com.netease.mvvm.R.layout.activity_mvvm_login);
  }
}
