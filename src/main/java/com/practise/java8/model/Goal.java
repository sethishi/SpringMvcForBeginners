package com.practise.java8.model;

import org.hibernate.validator.constraints.Range;

/**
 * Created by sethishi on 28/01/2016.
 */
public class Goal {

    @Range(min=1,max=50)
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
