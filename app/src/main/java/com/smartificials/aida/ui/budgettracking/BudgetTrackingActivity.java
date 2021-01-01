package com.smartificials.aida.ui.budgettracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.smartificials.aida.BR;
import com.smartificials.aida.R;
import com.smartificials.aida.databinding.ActivityAlarmBinding;
import com.smartificials.aida.databinding.ActivityBudgetTrackingBinding;
import com.smartificials.aida.di.component.ActivityComponent;
import com.smartificials.aida.ui.alarm.AlarmActivity;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.alarm.AlarmViewModel;
import com.smartificials.aida.ui.base.BaseActivity;

public class BudgetTrackingActivity extends BaseActivity<ActivityBudgetTrackingBinding, BudgetTrackingViewModel> implements BudgetTrackingNavigator {
    private ActivityBudgetTrackingBinding mActivityBudgetTrackingBinding;

    public static Intent newIntent(Context context) {
        return new Intent(context, BudgetTrackingActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_budget_tracking;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityBudgetTrackingBinding=getViewDataBinding();
        mViewModel.setNavigator(this);
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }

}