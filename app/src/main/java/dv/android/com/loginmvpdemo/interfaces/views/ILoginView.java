package dv.android.com.loginmvpdemo.interfaces.views;

public interface ILoginView {

    public void showProgress();
    public void hiddeProgress();

    public void setErrorUser();
    public void setErrorPass();

    public void goToHome();
}
