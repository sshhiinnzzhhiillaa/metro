package com.sshhiinnzzhhiillaa.metro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Station {

    private String name;
    private Optional<Station> nextStation;
    private Optional<Station> prevStation;

}
