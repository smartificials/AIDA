package com.smartificials.aida.di.module;

import androidx.core.util.Supplier;
import androidx.lifecycle.ViewModelProvider;


import com.smartificials.aida.ViewModelProviderFactory;
import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.base.BaseDialog;
import com.smartificials.aida.ui.main.rating.RateUsViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class DialogModule {

    private BaseDialog dialog;

    public DialogModule(BaseDialog dialog){
        this.dialog = dialog;
    }

    @Provides
    RateUsViewModel provideRateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<RateUsViewModel> supplier = () -> new RateUsViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<RateUsViewModel> factory = new ViewModelProviderFactory<>(RateUsViewModel.class, supplier);
        return new ViewModelProvider(dialog.getActivity(), factory).get(RateUsViewModel.class);
    }

}
