package com.smartificials.aida.di.component;


import com.smartificials.aida.di.module.DialogModule;
import com.smartificials.aida.di.scope.DialogScope;
import com.smartificials.aida.ui.main.rating.RateUsDialog;

import dagger.Component;

@DialogScope
@Component(modules = DialogModule.class, dependencies = AppComponent.class)
public interface DialogComponent {

    void inject(RateUsDialog dialog);

}
