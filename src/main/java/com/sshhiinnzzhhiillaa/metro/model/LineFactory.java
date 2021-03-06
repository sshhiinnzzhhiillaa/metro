package com.sshhiinnzzhhiillaa.metro.model;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class LineFactory {

    public static Line getLine(String name, List<Station> stations){

        Set<Station> stationSet = new LinkedHashSet<>();
        Station startStation = null;
        Station endStation = null;
        Station currentStation;

        for (int i = 0; i < stations.size(); i++) {
            currentStation = stations.get(i);
            if (i == 0){
                currentStation.setPrevStation(Optional.empty());
                currentStation.setNextStation(Optional.ofNullable(stations.get(i + 1)));
                startStation = currentStation;
            } else if (i == stations.size() - 1){
                currentStation.setPrevStation(Optional.ofNullable(stations.get(i - 1)));
                currentStation.setNextStation(Optional.empty());
                endStation = currentStation;
            } else {
                currentStation.setPrevStation(Optional.ofNullable(stations.get(i - 1)));
                currentStation.setNextStation(Optional.ofNullable(stations.get(i + 1)));
            }

            stationSet.add(currentStation);

        }

        return new Line(name, stationSet, startStation, endStation);

    }

}
