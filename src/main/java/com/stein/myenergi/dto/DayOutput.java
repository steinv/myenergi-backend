package com.stein.myenergi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DayOutput {
    // electricity in joules imported from the net
    private int imported;
    // electricity in joules exported to the net
    private int exported;

    // electricity in joules generated by solar panels
    private int generated;

    // electricity in joules charged into electrical vehicle
    private int charged;

    // electricity in joules consumed
    private int consumed;
}