package it.jaschke.alexandria.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Uli Wucherer (u.wucherer@gmail.com) on 15/11/15.
 */
public class Utility {

    /**
     * Figure out connectivity of device.
     * @link http://developer.android.com/training/monitoring-device-state/connectivity-monitoring.html
     *
     * @param context Application context
     * @return True if device has connectivity, false otherwise.
     */
    public static boolean hasConnectivity(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }
}
