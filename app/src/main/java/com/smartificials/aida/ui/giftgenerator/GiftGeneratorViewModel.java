

package com.smartificials.aida.ui.giftgenerator;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class GiftGeneratorViewModel extends BaseViewModel<GiftGeneratorNavigator> {

    public GiftGeneratorViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
