package com.sshhiinnzzhhiillaa.metro.service;

import com.sshhiinnzzhhiillaa.metro.model.Train;

public class TrainService {

    public static void reverse(Train train){
        train.setMovingForward(!train.isMovingForward());
    }

}
