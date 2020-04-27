package com.ming.design.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * I/O 装饰者-大写转小写
 *
 * @program: design-pattern
 * @description: 大写转小写-装饰者
 * @author: ming
 * @date: 2020-04-27 23:33
 */
public class MyLowerCaseInputStream extends FilterInputStream {

    public MyLowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int offset, int length) throws IOException {
        int result = super.read(b, offset, length);
        for (int i = offset; i < offset + result; ++i) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
