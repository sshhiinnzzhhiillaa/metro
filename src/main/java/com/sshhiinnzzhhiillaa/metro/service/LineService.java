package com.sshhiinnzzhhiillaa.metro.service;

import com.sshhiinnzzhhiillaa.metro.model.Train;

public class LineService {

    private TrainService trainService;
    private StationService stationService;

    public LineService(TrainService trainService, StationService stationService) {
        this.trainService = trainService;
        this.stationService = stationService;
    }

    //TODO: delete and write new logic
    public void reverseTrain(Train train){
        if(train.getCurrentStation().getNextStation().equals(null) || train.getCurrentStation().getPrevStation().equals(null)){
            trainService.reverse(train);
        }
    }
}
