package com.benjamin.springmvcstudy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Ben.Li
 * @date 2022/5/31 下午5:25
 */
public class MyTest {

    @Test
    public void test01() {
        List<Integer> list = Arrays.asList(2, 79, 80, 86, 90, 99, 100);
        Optional<Integer> optional = list.stream().max((a, b) -> a - b);
        System.out.println(optional.get());

    }
}
