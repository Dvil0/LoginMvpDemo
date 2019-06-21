package dv.android.com.loginmvpdemo.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import dv.android.com.loginmvpdemo.R;
import dv.android.com.loginmvpdemo.interfaces.presenters.ILoginPresenter;
import dv.android.com.loginmvpdemo.interfaces.views.ILoginView;
import dv.android.com.loginmvpdemo.presenters.LoginPresenter;

public class LoginView extends AppCompatActivity implements ILoginView {

    private ILoginPresenter loginPresenter;
    private EditText txtUser;
    private EditText txtPass;
    private ProgressBar prgLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginPresenter = new LoginPresenter(this);

        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);
        prgLogin = findViewById(R.id.prgLogin);

    }

    @Override
    public void showProgress() {
        prgLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void hiddeProgress() {
        prgLogin.setVisibility(View.GONE);

    }

    @Override
    public void setErrorUser() {
        txtUser.setError("Campo obligatorio.");
    }

    @Override
    public void setErrorPass() {
        txtPass.setError("Campo obligatorio.");
    }

    @Override
    public void goToHome() {
        startActivity(new Intent(LoginView.this, HomeView.class));
    }

    public void validateUser(View view){
        loginPresenter.validateUser(txtUser.getText().toString(), txtPass.getText().toString());
    }
}
