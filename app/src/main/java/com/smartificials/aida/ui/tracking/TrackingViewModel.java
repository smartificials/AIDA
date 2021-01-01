

package com.smartificials.aida.ui.tracking;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class TrackingViewModel extends BaseViewModel<TrackingNavigator> {

    public TrackingViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
