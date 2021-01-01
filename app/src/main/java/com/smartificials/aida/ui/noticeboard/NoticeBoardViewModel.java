

package com.smartificials.aida.ui.noticeboard;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmNavigator;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class NoticeBoardViewModel extends BaseViewModel<NoticeBoardNavigator> {

    public NoticeBoardViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
