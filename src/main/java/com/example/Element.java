package com.example;

import com.fasterxml.jackson.databind.JsonNode;

/*
 * JsonNodeで扱うのは勝手が悪いのでElementクラスを作りました。
 * ありがたがってください。
 *
 * 細かいオブジェクトたちはREADME.mdにあるタグ一覧見てください。
 */
public class Element {
    private int id;
    private String out_name;

    Element(JsonNode node, int index) {
        this.id = node.get("element").get(index).get("id").asInt();
    }
}
