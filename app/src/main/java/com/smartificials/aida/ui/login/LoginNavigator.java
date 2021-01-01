

package com.smartificials.aida.ui.login;


public interface LoginNavigator {

    void handleError(Throwable throwable);

    void login();

    void openMainActivity();
}
