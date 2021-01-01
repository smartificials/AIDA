
package com.smartificials.aida.di.component;

import android.app.Application;


import com.smartificials.aida.MvvmApp;
import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.di.module.AppModule;
import com.smartificials.aida.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MvvmApp app);

    DataManager getDataManager();

    SchedulerProvider getSchedulerProvider();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
