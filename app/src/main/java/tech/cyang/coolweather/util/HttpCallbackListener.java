package tech.cyang.coolweather.util;

/**
 * Created by cy101 on 2016/6/14.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
