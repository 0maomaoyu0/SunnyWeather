package com.example.coolweather.db;

//import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

// LitePal中每一个实体类都必须继承自DataSupport类
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public static void test() {
        // 修改hosts文件，配置github.com网址
//        关闭vpn
//        提交成功
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;


    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
