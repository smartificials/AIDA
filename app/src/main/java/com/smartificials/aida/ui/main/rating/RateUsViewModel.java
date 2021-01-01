

package com.smartificials.aida.ui.main.rating;


import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;

public class RateUsViewModel extends BaseViewModel<RateUsCallback> {

    public RateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onLaterClick() {
        getNavigator().dismissDialog();
    }

    public void onSubmitClick() {
        getNavigator().dismissDialog();
    }
}
