package com.smartificials.aida.di.module;

import androidx.core.util.Supplier;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.smartificials.aida.ViewModelProviderFactory;
import com.smartificials.aida.data.DataManager;
import com.smartificials.aida.ui.about.AboutViewModel;
import com.smartificials.aida.ui.base.BaseFragment;
import com.smartificials.aida.ui.feed.blogs.BlogAdapter;
import com.smartificials.aida.ui.feed.blogs.BlogViewModel;
import com.smartificials.aida.ui.feed.opensource.OpenSourceAdapter;
import com.smartificials.aida.ui.feed.opensource.OpenSourceViewModel;
import com.smartificials.aida.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;


@Module
public class FragmentModule {

    private BaseFragment<?, ?> fragment;

    public FragmentModule(BaseFragment<?, ?> fragment) {
        this.fragment = fragment;
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager() {
        return new LinearLayoutManager(fragment.getActivity());
    }

    @Provides
    AboutViewModel provideAboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<AboutViewModel> supplier = () -> new AboutViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<AboutViewModel> factory = new ViewModelProviderFactory<>(AboutViewModel.class, supplier);
        return new ViewModelProvider(fragment, factory).get(AboutViewModel.class);
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<>());
    }


    @Provides
    BlogViewModel provideBlogViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<BlogViewModel> supplier = () -> new BlogViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<BlogViewModel> factory = new ViewModelProviderFactory<>(BlogViewModel.class, supplier);
        return new ViewModelProvider(fragment, factory).get(BlogViewModel.class);
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter();
    }

    @Provides
    OpenSourceViewModel provideOpenSourceViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<OpenSourceViewModel> supplier = () -> new OpenSourceViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<OpenSourceViewModel> factory = new ViewModelProviderFactory<>(OpenSourceViewModel.class, supplier);
        return new ViewModelProvider(fragment, factory).get(OpenSourceViewModel.class);
    }
}
