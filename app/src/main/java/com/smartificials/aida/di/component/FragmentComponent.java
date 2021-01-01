package com.smartificials.aida.di.component;



import com.smartificials.aida.di.module.FragmentModule;
import com.smartificials.aida.di.scope.FragmentScope;
import com.smartificials.aida.ui.about.AboutFragment;
import com.smartificials.aida.ui.feed.blogs.BlogFragment;
import com.smartificials.aida.ui.feed.opensource.OpenSourceFragment;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentModule.class, dependencies = AppComponent.class)
public interface FragmentComponent {
    void inject(BlogFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(AboutFragment fragment);
}
