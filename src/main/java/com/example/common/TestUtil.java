package com.example.common;

import java.util.UUID;

/**
 * @author: 潇然
 * @create: 2019/5/17
 * @desc:
 */
public class TestUtil {
    public String createUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
