package com.smartificials.aida.ui.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.smartificials.aida.BR;
import com.smartificials.aida.R;
import com.smartificials.aida.databinding.ActivityAlarmBinding;
import com.smartificials.aida.databinding.ActivityLoginBinding;
import com.smartificials.aida.di.component.ActivityComponent;
import com.smartificials.aida.ui.base.BaseActivity;
import com.smartificials.aida.ui.login.LoginActivity;
import com.smartificials.aida.ui.login.LoginNavigator;
import com.smartificials.aida.ui.login.LoginViewModel;
import com.smartificials.aida.ui.main.MainActivity;

public class AlarmActivity extends BaseActivity<ActivityAlarmBinding, AlarmViewModel> implements AlarmNavigator {
    private ActivityAlarmBinding mActivityAlarmBinding;

    public static Intent newIntent(Context context) {
        return new Intent(context, AlarmActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_alarm;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityAlarmBinding=getViewDataBinding();
        mViewModel.setNavigator(this);
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }
}