package dv.android.com.loginmvpdemo.presenters;

import dv.android.com.loginmvpdemo.interfaces.listeners.OnLoginListener;
import dv.android.com.loginmvpdemo.interfaces.models.ILoginModel;
import dv.android.com.loginmvpdemo.interfaces.presenters.ILoginPresenter;
import dv.android.com.loginmvpdemo.interfaces.views.ILoginView;
import dv.android.com.loginmvpdemo.models.LoginModel;

public class LoginPresenter implements ILoginPresenter, OnLoginListener {

    private ILoginView loginView;
    private ILoginModel loginModel;

    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
        loginModel = new LoginModel();
    }

    @Override
    public void validateUser(String user, String pass) {
        if(loginView!=null){
            loginView.showProgress();
            loginModel.validateUser(user, pass, this);
        }

    }

    @Override
    public void setErrorUser() {
        if(loginView!=null){
            loginView.hiddeProgress();
            loginView.setErrorUser();
        }
    }

    @Override
    public void setErrorPass() {
        if(loginView!=null){
            loginView.hiddeProgress();
            loginView.setErrorPass();
        }
    }

    @Override
    public void success() {
        if(loginView!=null){
            loginView.goToHome();
        }
    }
}
