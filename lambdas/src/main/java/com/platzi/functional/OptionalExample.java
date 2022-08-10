package com.platzi.functional;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()) {

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        Optional<String> valuablePlayer = optionalValuablePlayer();

        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
    }


    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        return Collections.emptyList();
    }

    static Optional<List<String>> getOptionalNames() {
        List<String> nameList = new LinkedList<>();
        return Optional.of(nameList);
    }

    static Optional<String> optionalValuablePlayer() {
        //return Optional.ofNullable();
        try{
            //Example access to a data base
            return Optional.of("Juako");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
