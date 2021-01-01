package com.smartificials.aida.di.component;


import com.smartificials.aida.di.module.ActivityModule;
import com.smartificials.aida.di.scope.ActivityScope;
import com.smartificials.aida.ui.alarm.AlarmActivity;
import com.smartificials.aida.ui.assembledress.AssembleDressActivity;
import com.smartificials.aida.ui.budgettracking.BudgetTrackingActivity;
import com.smartificials.aida.ui.chores.ChoresActivity;
import com.smartificials.aida.ui.familyfuntime.FamilyFunTimeActivity;
import com.smartificials.aida.ui.feed.FeedActivity;
import com.smartificials.aida.ui.foodschedule.FoodScheduleActivity;
import com.smartificials.aida.ui.giftgenerator.GiftGenerationActivity;
import com.smartificials.aida.ui.infopartner.InfoPartnerActivity;
import com.smartificials.aida.ui.login.LoginActivity;
import com.smartificials.aida.ui.main.MainActivity;
import com.smartificials.aida.ui.noticeboard.NoticeBoardActivity;
import com.smartificials.aida.ui.savings.SavingsActivity;
import com.smartificials.aida.ui.splash.SplashActivity;
import com.smartificials.aida.ui.storage.StorageActivity;
import com.smartificials.aida.ui.tracking.TrackingActivity;

import dagger.Component;


@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {

    void inject(FeedActivity activity);

    void inject(LoginActivity activity);

    void inject(MainActivity activity);

    void inject(SplashActivity splashActivity);

    void inject(AlarmActivity alarmActivity);

    void inject(BudgetTrackingActivity budgetTrackingActivity);

    void inject(ChoresActivity choresActivity);

    void inject(FamilyFunTimeActivity familyFunTimeActivity);

    void inject(FoodScheduleActivity foodScheduleActivity);

    void inject(GiftGenerationActivity giftGenerationActivity);

    void inject(InfoPartnerActivity infoPartnerActivity);

    void inject(NoticeBoardActivity noticeBoardActivity);

    void inject(AssembleDressActivity assembleDressActivity);

    void inject(SavingsActivity savingsActivity);

    void inject(StorageActivity storageActivity);

    void inject(TrackingActivity trackingActivity);
}
