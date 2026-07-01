package com.example;

import java.util.Arrays;
import java.util.List;

public class Split {
    public static void main(String[] args) {
//        String row = "Title; Content;";
//        String[] pieces = row.split(";");
//        for (int i = 0; i < pieces.length; i++) {
//            System.out.println(i + ": " + pieces[i]);
//        }

        String tsv = "Party;1968;1972;1976;1980;1984;1988";
        List<String> tsvPieces = Arrays.asList(tsv.split(";"));
        for (int i = 0; i < tsvPieces.size(); i++) {
            System.out.println(i + ": " + tsvPieces.get(i));
        }
    }
}
