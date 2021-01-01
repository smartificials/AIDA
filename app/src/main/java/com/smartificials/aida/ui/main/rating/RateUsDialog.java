

package com.smartificials.aida.ui.main.rating;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;


import com.smartificials.aida.MvvmApp;
import com.smartificials.aida.R;
import com.smartificials.aida.databinding.DialogRateUsBinding;
import com.smartificials.aida.di.component.DaggerDialogComponent;
import com.smartificials.aida.di.component.DialogComponent;
import com.smartificials.aida.di.module.DialogModule;
import com.smartificials.aida.ui.base.BaseDialog;

import javax.inject.Inject;

public class RateUsDialog extends BaseDialog implements RateUsCallback {

    private static final String TAG = "RateUsDialog";

    @Inject
    RateUsViewModel mRateUsViewModel;

    public static RateUsDialog newInstance() {
        RateUsDialog fragment = new RateUsDialog();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void dismissDialog() {
        dismissDialog(TAG);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        DialogRateUsBinding binding = DataBindingUtil.inflate(inflater, R.layout.dialog_rate_us, container, false);
        View view = binding.getRoot();

        performDependencyInjection(getBuildComponent());

        binding.setViewModel(mRateUsViewModel);

        mRateUsViewModel.setNavigator(this);

        return view;
    }

    public void show(FragmentManager fragmentManager) {
        super.show(fragmentManager, TAG);
    }

    private DialogComponent getBuildComponent(){
        return DaggerDialogComponent.builder()
                .appComponent(((MvvmApp)(getContext().getApplicationContext())).appComponent)
                .dialogModule(new DialogModule(this))
                .build();
    }

    private void performDependencyInjection(DialogComponent buildComponent){
        buildComponent.inject(this);
    }
}
