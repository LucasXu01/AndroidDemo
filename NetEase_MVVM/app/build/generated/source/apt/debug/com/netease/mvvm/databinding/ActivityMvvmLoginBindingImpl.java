package com.netease.mvvm.databinding;
import com.netease.mvvm.R;
import com.netease.mvvm.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMvvmLoginBindingImpl extends ActivityMvvmLoginBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMvvmLoginBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMvvmLoginBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.netease.mvvm.vm.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.netease.mvvm.vm.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelUserInfoName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelUserInfoPwd((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelUserInfoName(android.databinding.ObservableField<java.lang.String> LoginViewModelUserInfoName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelUserInfoPwd(android.databinding.ObservableField<java.lang.String> LoginViewModelUserInfoPwd, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.text.TextWatcher loginViewModelNameInputListener = null;
        java.lang.String loginViewModelUserInfoPwdGet = null;
        android.view.View.OnClickListener loginViewModelLoginClickListener = null;
        android.databinding.ObservableField<java.lang.String> loginViewModelUserInfoName = null;
        java.lang.String loginViewModelUserInfoNameGet = null;
        android.databinding.ObservableField<java.lang.String> loginViewModelUserInfoPwd = null;
        com.netease.mvvm.model.UserInfo loginViewModelUserInfo = null;
        android.text.TextWatcher loginViewModelPwdInputListener = null;
        com.netease.mvvm.vm.LoginViewModel loginViewModel = mLoginViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.nameInputListener
                        loginViewModelNameInputListener = loginViewModel.nameInputListener;
                        // read loginViewModel.loginClickListener
                        loginViewModelLoginClickListener = loginViewModel.loginClickListener;
                        // read loginViewModel.pwdInputListener
                        loginViewModelPwdInputListener = loginViewModel.pwdInputListener;
                    }
            }

                if (loginViewModel != null) {
                    // read loginViewModel.userInfo
                    loginViewModelUserInfo = loginViewModel.userInfo;
                }

            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModelUserInfo != null) {
                        // read loginViewModel.userInfo.name
                        loginViewModelUserInfoName = loginViewModelUserInfo.name;
                    }
                    updateRegistration(0, loginViewModelUserInfoName);


                    if (loginViewModelUserInfoName != null) {
                        // read loginViewModel.userInfo.name.get()
                        loginViewModelUserInfoNameGet = loginViewModelUserInfoName.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModelUserInfo != null) {
                        // read loginViewModel.userInfo.pwd
                        loginViewModelUserInfoPwd = loginViewModelUserInfo.pwd;
                    }
                    updateRegistration(1, loginViewModelUserInfoPwd);


                    if (loginViewModelUserInfoPwd != null) {
                        // read loginViewModel.userInfo.pwd.get()
                        loginViewModelUserInfoPwdGet = loginViewModelUserInfoPwd.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView1.addTextChangedListener(loginViewModelNameInputListener);
            this.mboundView2.addTextChangedListener(loginViewModelPwdInputListener);
            this.mboundView3.setOnClickListener(loginViewModelLoginClickListener);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, loginViewModelUserInfoNameGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, loginViewModelUserInfoPwdGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.userInfo.name
        flag 1 (0x2L): loginViewModel.userInfo.pwd
        flag 2 (0x3L): loginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}