package com.ming.design.decorator;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author ming
 * @date 2020-04-26 23:20
 */
public class MyInputStreamTest {

    @Test
    public void test() {
        int c;
        try {
            InputStream inputStream =
                    new MyLowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src/test/java/com/ming/design/decorator/test.txt")
                            )
                    );
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            System.out.println();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
