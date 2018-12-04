package com.wizag.databinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wizag.databinding.databinding.ActivityLoginBinding;

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding activity_loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activity_loginBinding.setViewModel(new LoginViewModel());
        activity_loginBinding.executePendingBindings();


    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String Message) {
        if (Message != null) {
            Toast.makeText(view.getContext(), Message, Toast.LENGTH_SHORT).show();
        }
    }

}
