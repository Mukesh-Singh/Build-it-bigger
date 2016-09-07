package com.app.joks.build_it_bigger;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by mukesh on 1/9/16.
 */
public class Utility {

    /**
     * Static method to check network availability
     *
     * @param context Context of the calling class
     */
    public static boolean isNetworkConnected(Context context) {

        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }
}
