package com.bookuu.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Data
@Slf4j
@Component
public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101200672082";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCPZslJtIKH3mbBvU+doJ98clIdeF2XQg9UlBNLZTY2+Hql6ktynbWPnjai5THbjIXfDxrao4M2crOihbAZpg+IfjKdcbuIobgxVyGYE4n5CcdKmmMhqfBJl97ACU4L93rhLb5KWIp0iCh/fxJeWzcY1xXHNfUQNV/7C2MrcCydUrUGc80AzIL/OCjvL7ak9VEBHki4K7p2EmyfVIdZ+awdgouMYb0S0oOmuphoqJ50aobU20FE2Wbb/5vrWiQB4FXqdWpFDWMuBA9kJGvGeBi0R+u7mEk6ms42lcz0q4nUghCODuQHpvGQsVXvUwzZ2ldXKKHPZeSBtDHdxnbwBmpdAgMBAAECggEATNONjY5GzFHrjWpGCDXwm/SHZ8B/q7S5j9+RArijtgmjc9Y1O5+gkOP7c4QFFRGQ+zMVeQNXHcmP0cd71BHyinbJ2S4Aga/ahZyfo+D770881QwnhfaMhHD35rxVcvXQgGlIZH5RFyOHRt8mUSTfPNCmm0aeF2PxGwc7xx7e2B2MsqZ9s8h+PPcp3nd2MtVV+ueZkrkzzWTfxE62KeGMyKrXKNltXKZGTyv66mcpeyOgCupm5meLHzINbVk4Ez3Hr4/1m6e98M5DviKjrLUPs0KsqhcyR5/wWCqLngS3YnMdiitWZZeZ9TclNUrjGH7Xbbbb1ft6hICY6x9mF8MnxQKBgQD+pdOXUNI8Krjf0/qckUjnisThZcqFIHutHGxz/bLLgj4Vi1P5PsPqRTIfMgpWcQqIYYTGK4IJAARsIl8aDs2nTDQfd4pTbxUv0TFmAActNWWohY3cYforZjQ9NZDfQW+hc/BXQ4W7VT0dQyUBOR3L+LyRAVVXqypdS5JDr+fwFwKBgQCQKbqyKP6zx0/V/SLiOXHyC7+KwSYQ3evfCXndxB6jz6v3sbx5aCpBPCCYfVlqyFSTHQdyLQ+F4eSfjkC9QfjBWMBAgNBMu39Z28VJVv9i4PgXw8gsy23LgVTEYJYeCUA1PpzMrHZvKbicARH23f1xj7VSv1Ow2WcqRCR0/mMtqwKBgC8M2qyRrVaamjAZDawSGANYG4p98U5psxBIOS2xSXDarrfyV2CtHSvS/zDOYSSZnFWYlxy6eztIeoi0TRgWdh8cMGFECBXkZ2i/YT40cR8ER7U8f/qhS8TrDGnm1M67W3HcZyLogfQcCr+2YUb5k6zVV5n/QhKBuMEmLm89OECfAoGAAdbGbude+GQefJhSDZi1/2Ru+RIlrilmjN3OFCogSe6oPuyhftr5TwO5Vriin14W1hmUsrwoaojLJc3mvYNN7Ql4ylnaTmBF65uGFL1rXJOKFqOEti2SJPptXmPtBk0P6J332hSJHjnmBPduhzultAElSvzt0F+1lTBxVpy4HykCgYEAplGs1Uu8m7gpn+FMlliHe+gC2mQukwpFDjvT47mjwnGuRkMldbdCfmqeAMMZ7EsBS4CfP/xGIjxPAkZB6eGEDDJCNjvz0Mg+2UiKwteB7IgMxaL9S/CnHMlcKOPHiYdRR3SeYvVnEzmMIIJfWmouitcotf46rAQqt3HyJR07++w=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp1GzMg3/He2GaytG3iM0KlckzViV+VwPdW0rIxUOsLxsj2Xgz7izCgrTzmk6xZV0oMh5/ggnPAn1lkfTNa3l9WLP+0M8PAoG9Flz0ImCn10ozsJwDYMPl5yJGtMv4cMuJi142yYY4jxYChrXouo0wuFwLZGgfHZuUnyverzopdJg7itWzDeiyM+ekIs4b63t0zcE7DNqwqLvtWixdjZHCeYAAbWUQnP9OjETxE0njeb7aau6R5CV1ppWjeztOH85TFRpWn5PfZmSrF4rnLxuDLFunS3/DBlMFsybT6zHK+RAhb/77LSPF55adv0XaQYzYyhqSwuaZu8CXsh3ILH5uQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问，测试修改springboot端口和外网地址
    public static String notify_url = "http://127.0.0.1:8080";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网（通过netapp获取net123或自己购买生成）可以正常访问
    public static String return_url = "http://127.0.0.1:8080";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 支付宝网关
    public static String log_path = "C:\\";
    /** * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）*/
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
