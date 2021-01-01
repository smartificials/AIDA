package com.smartificials.aida.di.module;


import androidx.core.util.Supplier;
import androidx.lifecycle.ViewModelProvider;


import com.smartificials.aida.ViewModelProviderFactory;
import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.alarm.AlarmViewModel;
import com.smartificials.aida.ui.assembledress.AssembleDressViewModel;
import com.smartificials.aida.ui.base.BaseActivity;
import com.smartificials.aida.ui.budgettracking.BudgetTrackingViewModel;
import com.smartificials.aida.ui.chores.ChoresViewModel;
import com.smartificials.aida.ui.familyfuntime.FamilyFunTimeViewModel;
import com.smartificials.aida.ui.feed.FeedPagerAdapter;
import com.smartificials.aida.ui.feed.FeedViewModel;
import com.smartificials.aida.ui.foodschedule.FoodScheduleViewModel;
import com.smartificials.aida.ui.giftgenerator.GiftGeneratorViewModel;
import com.smartificials.aida.ui.infopartner.InfoPartnerViewModel;
import com.smartificials.aida.ui.login.LoginViewModel;
import com.smartificials.aida.ui.main.MainViewModel;
import com.smartificials.aida.ui.noticeboard.NoticeBoardViewModel;
import com.smartificials.aida.ui.savings.SavingsViewModel;
import com.smartificials.aida.ui.splash.SplashViewModel;
import com.smartificials.aida.ui.storage.StorageViewModel;
import com.smartificials.aida.ui.tracking.TrackingViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;


@Module
public class ActivityModule {
    private BaseActivity<?, ?> activity;

    public ActivityModule(BaseActivity<?, ?> activity) {
        this.activity = activity;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter() {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    FeedViewModel provideFeedViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<FeedViewModel> supplier = () -> new FeedViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<FeedViewModel> factory = new ViewModelProviderFactory<>(FeedViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(FeedViewModel.class);
    }

    @Provides
    MainViewModel provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<MainViewModel> supplier = () -> new MainViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<MainViewModel> factory = new ViewModelProviderFactory<>(MainViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(MainViewModel.class);
    }

    @Provides
    LoginViewModel provideLoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<LoginViewModel> supplier = () -> new LoginViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<LoginViewModel> factory = new ViewModelProviderFactory<>(LoginViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(LoginViewModel.class);
    }

    @Provides
    SplashViewModel provideSplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<SplashViewModel> supplier = () -> new SplashViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<SplashViewModel> factory = new ViewModelProviderFactory<>(SplashViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(SplashViewModel.class);
    }

    @Provides
    AlarmViewModel provideAlarmViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<AlarmViewModel> supplier = () -> new AlarmViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<AlarmViewModel> factory = new ViewModelProviderFactory<>(AlarmViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(AlarmViewModel.class);
    }

    @Provides
    BudgetTrackingViewModel provideBudgetTrackingViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<BudgetTrackingViewModel> supplier = () -> new BudgetTrackingViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<BudgetTrackingViewModel> factory = new ViewModelProviderFactory<>(BudgetTrackingViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(BudgetTrackingViewModel.class);
    }

    @Provides
    ChoresViewModel provideChoresTrackingViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<ChoresViewModel> supplier = () -> new ChoresViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<ChoresViewModel> factory = new ViewModelProviderFactory<>(ChoresViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(ChoresViewModel.class);
    }

    @Provides
    FamilyFunTimeViewModel provideFamilyFunTimeViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<FamilyFunTimeViewModel> supplier = () -> new FamilyFunTimeViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<FamilyFunTimeViewModel> factory = new ViewModelProviderFactory<>(FamilyFunTimeViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(FamilyFunTimeViewModel.class);
    }

    @Provides
    FoodScheduleViewModel provideFoodScheduleViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<FoodScheduleViewModel> supplier = () -> new FoodScheduleViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<FoodScheduleViewModel> factory = new ViewModelProviderFactory<>(FoodScheduleViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(FoodScheduleViewModel.class);
    }

    @Provides
    GiftGeneratorViewModel provideGiftGeneratorViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<GiftGeneratorViewModel> supplier = () -> new GiftGeneratorViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<GiftGeneratorViewModel> factory = new ViewModelProviderFactory<>(GiftGeneratorViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(GiftGeneratorViewModel.class);
    }

    @Provides
    InfoPartnerViewModel provideInfoPartnerViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<InfoPartnerViewModel> supplier = () -> new InfoPartnerViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<InfoPartnerViewModel> factory = new ViewModelProviderFactory<>(InfoPartnerViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(InfoPartnerViewModel.class);
    }

    @Provides
    NoticeBoardViewModel provideNoticeBoardViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<NoticeBoardViewModel> supplier = () -> new NoticeBoardViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<NoticeBoardViewModel> factory = new ViewModelProviderFactory<>(NoticeBoardViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(NoticeBoardViewModel.class);
    }

    @Provides
    AssembleDressViewModel provideAssembleDressViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<AssembleDressViewModel> supplier = () -> new AssembleDressViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<AssembleDressViewModel> factory = new ViewModelProviderFactory<>(AssembleDressViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(AssembleDressViewModel.class);
    }

    @Provides
    SavingsViewModel provideSavingsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<SavingsViewModel> supplier = () -> new SavingsViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<SavingsViewModel> factory = new ViewModelProviderFactory<>(SavingsViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(SavingsViewModel.class);
    }

    @Provides
    StorageViewModel provideStorageViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<StorageViewModel> supplier = () -> new StorageViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<StorageViewModel> factory = new ViewModelProviderFactory<>(StorageViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(StorageViewModel.class);
    }

    @Provides
    TrackingViewModel provideTrackingViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<TrackingViewModel> supplier = () -> new TrackingViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<TrackingViewModel> factory = new ViewModelProviderFactory<>(TrackingViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(TrackingViewModel.class);
    }



}
