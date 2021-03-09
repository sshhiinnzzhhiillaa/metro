package com.sshhiinnzzhhiillaa.metro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Line {

    private String name;
    private Set<Station> stations;
    private Station start;
    private Station end;

}
