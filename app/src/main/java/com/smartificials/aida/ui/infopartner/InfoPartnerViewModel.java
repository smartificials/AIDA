

package com.smartificials.aida.ui.infopartner;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class InfoPartnerViewModel extends BaseViewModel<InfoPartnerNavigator> {

    public InfoPartnerViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
