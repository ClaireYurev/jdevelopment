package com.claireyurev;

public enum DaysOfTheWeek {
    MONDAY(20),
    TUESDAY(30),
    WEDNESDAY(40),
    THURSDAY(50),
    FRIDAY(60),
    SATURDAY(100),
    SUNDAY(90);

    final int levelOfDeliciousness;

    // create a constructor:
    DaysOfTheWeek (int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

}
