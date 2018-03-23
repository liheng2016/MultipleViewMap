package com.seekhoney.library_gdmap.component;

import com.seekhoney.library_gdmap.module.SelectModule;
import com.seekhoney.library_gdmap.scope.ActivityScope;
import com.seekhoney.library_gdmap.ui.SelectActivity;
import dagger.Component;

import javax.inject.Inject;

/**
 * Created by ryan on 18/3/23.
 */

@ActivityScope
@Component (modules = SelectModule.class)
public interface SelectComponent
{
    @Inject
    void inject(SelectActivity activity);
}
