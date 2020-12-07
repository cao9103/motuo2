package com.shitouren.core.bean.param;

import io.lettuce.core.codec.StringCodec;
import lombok.Data;

@Data
public class RealNameParam {

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String idCardNum;

    /**
     *
     */
    private String imgUrl;

}
