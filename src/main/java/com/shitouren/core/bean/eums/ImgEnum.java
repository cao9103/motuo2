package com.shitouren.core.bean.eums;

public enum ImgEnum {
    img("http://s29t424319.qicp.vip/shuiguo/", "C:/Users/ABC/Desktop/shuiguo/", ""),
    QrCode("http://s29t424319.qicp.vip/shuiguo/", "C:/Users/ABC/Desktop/shuiguo/", "");
    private String url;
    private String path;
    private String src;

    ImgEnum(String url, String path, String src) {
        this.url = url;
        this.path = path;
        this.src = src;
    }

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public String getSrc() {
        return src;
    }


}
