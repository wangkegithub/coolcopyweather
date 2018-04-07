package example.dell.coolcopyweather.gson;

/**
 * Created by kwang on 2018/4/6.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
