package com.smartificials.aida.ui.giftgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.smartificials.aida.BR;
import com.smartificials.aida.R;
import com.smartificials.aida.databinding.ActivityAlarmBinding;
import com.smartificials.aida.databinding.ActivityGiftGenerationBinding;
import com.smartificials.aida.di.component.ActivityComponent;
import com.smartificials.aida.ui.alarm.AlarmActivity;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.alarm.AlarmViewModel;
import com.smartificials.aida.ui.base.BaseActivity;

public class GiftGenerationActivity extends BaseActivity<ActivityGiftGenerationBinding, GiftGeneratorViewModel> implements GiftGeneratorNavigator {
    private ActivityGiftGenerationBinding mActivityGiftGeneratorBinding;

    public static Intent newIntent(Context context) {
        return new Intent(context, GiftGenerationActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_gift_generation;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityGiftGeneratorBinding=getViewDataBinding();
        mViewModel.setNavigator(this);
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }

}