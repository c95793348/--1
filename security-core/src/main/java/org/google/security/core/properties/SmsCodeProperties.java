package org.google.security.core.properties;

/**
 * Created by wbcaoa on 2018/4/9.
 */
public class SmsCodeProperties {

    private int length = 6;
    private int expireIn = 180;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

}
