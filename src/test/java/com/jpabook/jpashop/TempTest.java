package com.jpabook.jpashop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TempTest {

    @Test
    void mapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("사과", "apple");
        map.put("오렌지", "orange");
        map.put("키위", "kiwi");

        for (String key : map.keySet()) {
            if (map.get(key).equals("apple")) {
                System.out.println("key = " + key);
            }
        }
    }
}
