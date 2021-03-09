package com.sshhiinnzzhhiillaa.metro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {

    private String number;
    private boolean isMovingForward;
    private Station currentStation;

    public void waitPassengers(){
        //TODO: write body
    }

    public void go(){
        //TODO: write body
    }

}
