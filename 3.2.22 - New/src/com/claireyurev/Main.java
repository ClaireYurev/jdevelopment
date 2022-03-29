package com.claireyurev;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// Tuple

        System.out.println(DaysOfTheWeek.MONDAY.levelOfDeliciousness);

        final Object[] myTuple = {42, "test", Collections.EMPTY_LIST };

        // ENUMS
        DaysOfTheWeek myFaveDay = DaysOfTheWeek.MONDAY;
        DaysOfTheWeek.values();

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }
    }
}
