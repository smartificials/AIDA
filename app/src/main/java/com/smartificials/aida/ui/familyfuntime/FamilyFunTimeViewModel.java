

package com.smartificials.aida.ui.familyfuntime;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class FamilyFunTimeViewModel extends BaseViewModel<FamilyFunTimeNavigator> {

    public FamilyFunTimeViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
