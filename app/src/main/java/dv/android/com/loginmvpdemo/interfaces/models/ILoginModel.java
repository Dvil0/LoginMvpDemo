package dv.android.com.loginmvpdemo.interfaces.models;

import dv.android.com.loginmvpdemo.interfaces.listeners.OnLoginListener;

public interface ILoginModel {

    public void validateUser(final String user, final String pass, final OnLoginListener listener);
}
