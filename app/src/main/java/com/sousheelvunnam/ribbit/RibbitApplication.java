package com.sousheelvunnam.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;
import com.sousheelvunnam.ribbit.com.sousheelvunnam.ribbit.ui.MyActivity;
import com.sousheelvunnam.ribbit.com.sousheelvunnam.ribbit.utils.ParseConstants;

/**
 * Created by Sousheel on 11/12/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "Dxi6Vq7nf0RQAeqP22Iz2f1CGNY45HI7Szvs1xPW", "QRoo0IYmCbhhmmQGi5VaLulPrTcDOAcSACTKugFp");

        //PushService.setDefaultPushCallback(this, MyActivity.class);
        PushService.setDefaultPushCallback(this, MyActivity.class, R.drawable.ic_stat_ic_launcher);
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();

    }
}
