package com.sshhiinnzzhhiillaa.metro.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "TRAIN")
public class Train {

    @Id
    @Column(name = "train_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Getter @Setter
    private Integer id;

    @Column(name = "is_available")
    @Getter @Setter
    private Boolean isAvailable;

    @OneToOne
    @JoinColumn(name = "current_station", referencedColumnName = "station_id")
    @Getter @Setter
    private Station currentStation;

    public Train() {
    }

}
