package com.freement.jasyptdemo;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Component;

/**
 * @author:
 * @date: 2021/8/22 9:08 上午
 * @description
 * 自定义加密、解密算法
 */
@Component
public class MyStringEncryptor implements StringEncryptor {
    @Override
    public String encrypt(String s) {
        switch (s) {
            case "root":
                return "root-en";
            case "admin":
                return "admin-en";
        }

        return null;
    }

    @Override
    public String decrypt(String s) {
        switch (s) {
            case "root-en":
                return "root";
            case "admin-en":
                return "admin";
        }
        return null;
    }
}