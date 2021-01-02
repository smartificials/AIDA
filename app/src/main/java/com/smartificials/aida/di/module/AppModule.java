package com.smartificials.aida.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smartificials.aida.BuildConfig;
import com.smartificials.aida.R;
import com.smartificials.aida.data.AppDataManager;
import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.data.local.db.AppDatabase;
import com.smartificials.aida.data.local.db.AppDbHelper;
import com.smartificials.aida.data.local.db.DbHelper;
import com.smartificials.aida.data.local.prefs.AppPreferencesHelper;
import com.smartificials.aida.data.local.prefs.PreferencesHelper;
import com.smartificials.aida.data.remote.ApiHeader;
import com.smartificials.aida.data.remote.ApiHelper;
import com.smartificials.aida.data.remote.AppApiHelper;
import com.smartificials.aida.di.ApiInfo;
import com.smartificials.aida.di.DatabaseInfo;
import com.smartificials.aida.di.PreferenceInfo;
import com.smartificials.aida.utils.AppConstants;
import com.smartificials.aida.utils.rx.AppSchedulerProvider;
import com.smartificials.aida.utils.rx.SchedulerProvider;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
//import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Module
public class AppModule {

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, dbName).fallbackToDestructiveMigration()
                .build();
    }

    //@Provides
   // @Singleton
//    CalligraphyConfig provideCalligraphyDefaultConfig() {
//        return new CalligraphyConfig.Builder()
//                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
//                .setFontAttrId(R.attr.fontPath)
//                .build();
    //}

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

}
