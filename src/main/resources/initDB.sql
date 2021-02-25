CREATE TABLE IF NOT EXISTS STATION
(
    station_id int PRIMARY KEY,
    is_end station int NOT NULL
)
DROP TABLE IF EXISTS STATION

CREATE TABLE IF NOT EXISTS TRAIN
(
    train_id int PRIMARY KEY,
    is_available int NOT NULL,
    current_station int FOREIGN KEY
)
DROP TABLE IF EXISTS TRAIN