package com.wizag.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class LoginViewModel extends BaseObservable {

    private User user;

    String successMessage = "Login was successful";
    String errorMessage = "Email or Password not valid";

    @Bindable
    public String toastMessage = null;


    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(com.wizag.databinding.BR.toastMessage);

    }

    public LoginViewModel() {
        user = new User("", "");

    }

    public void afterEmailTextChanged(CharSequence s) {
        user.setEmail(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        user.setPassword(s.toString());
    }

    public void onLoginClicked() {
        if (user.isInputValid()) {
            setToastMessage(successMessage);
        } else {
            setToastMessage(errorMessage);
        }

    }
}
