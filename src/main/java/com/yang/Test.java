package com.yang;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {
//        Float f =  Float.valueOf(12.33f);
//
//        System.out.println(f);
//
//        BigDecimal b = new BigDecimal(String.valueOf(f));
//
//        System.out.println(b);

//        Goods goods1 = new Goods().setId(1).setName("apple");
        Goods goods2 = new Goods().setId(null).setName("banana");
        List<Goods> goods = new ArrayList<>();
//        goods.add(goods1);
        goods.add(goods2);


        List<Integer> goodsIds = goods.stream().filter(Objects::nonNull).map(Goods::getId).distinct().collect(toList());

        System.out.println(goodsIds);

        System.out.println(goodsIds.isEmpty());
    }
}
