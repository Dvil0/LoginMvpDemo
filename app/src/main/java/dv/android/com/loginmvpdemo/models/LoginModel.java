package dv.android.com.loginmvpdemo.models;



import android.os.Handler;

import dv.android.com.loginmvpdemo.interfaces.listeners.OnLoginListener;
import dv.android.com.loginmvpdemo.interfaces.models.ILoginModel;

public class LoginModel implements ILoginModel {

    @Override
    public void validateUser(final String user, final String pass, final OnLoginListener listener){
        //TODO DV: Incluir conexion a base de datos con SqLiteExample.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(user==null || user.equals("")){
                    listener.setErrorUser();
                    return;
                }
                else if(pass==null || pass.equals("")){
                    listener.setErrorPass();
                    return;
                }

                listener.success();

            }
        }, 3000);
    }
}
