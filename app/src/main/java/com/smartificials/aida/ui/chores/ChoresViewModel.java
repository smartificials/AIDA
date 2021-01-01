

package com.smartificials.aida.ui.chores;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class ChoresViewModel extends BaseViewModel<ChoresNavigator> {

    public ChoresViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
