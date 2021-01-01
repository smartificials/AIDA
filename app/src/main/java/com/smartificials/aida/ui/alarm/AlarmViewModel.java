

package com.smartificials.aida.ui.alarm;

import android.text.TextUtils;

import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.data.model.api.LoginRequest;
import com.smartificials.aida.ui.base.BaseViewModel;
import com.smartificials.aida.ui.login.LoginNavigator;
import com.smartificials.aida.utils.CommonUtils;
import com.smartificials.aida.utils.rx.SchedulerProvider;


public class AlarmViewModel extends BaseViewModel<AlarmNavigator> {

    public AlarmViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
