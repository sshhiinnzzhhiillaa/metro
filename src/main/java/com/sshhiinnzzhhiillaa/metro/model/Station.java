package com.sshhiinnzzhhiillaa.metro.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "STATION")
public class Station {

    @Id
    @Column(name = "station_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Getter @Setter
    private Integer id;

    @Column(name = "is_end_station")
    @Getter @Setter
    private Boolean isEndStation;

    public Station() {
    }

}
