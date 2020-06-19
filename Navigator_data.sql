INSERT INTO Cities(name) VALUES 'Ciudad 1'; 
INSERT INTO Cities(name) VALUES 'Ciudad 2'; 

INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station A', 'address A', 30.0, 30.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station B', 'address B', 0.0, 0.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station C', 'address C', 30.0, 60.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station D', 'address D', 60.0, 0.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station E', 'address E', 100.0, 30.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station F', 'address F', 60.0, 60.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station G', 'address G', 100.0, 100.0, 1);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station 1', 'address 1', 200.0, 200.0, 2);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station 2', 'address 2', 250.0, 100.0, 2);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station 3', 'address 3', 225.0, 225.0, 2);
INSERT INTO Stations(name,address,latitude,longitude,city_id) VALUES ('Station 4', 'address 4', 250.0, 180.0, 2);

INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,2);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (2,4);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,3);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (3,6);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (6,7);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,5);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (5,6);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (4,5);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (8,9);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (9,10);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (10,11);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (9,4);

INSERT INTO Railway_Lines(name) VALUES ('Line A');
INSERT INTO Railway_Lines(name) VALUES ('Line B');
INSERT INTO Railway_Lines(name) VALUES ('Line C');
INSERT INTO Railway_Lines(name) VALUES ('Line D');
INSERT INTO Railway_Lines(name) VALUES ('Line E');
INSERT INTO Railway_Lines(name) VALUES ('Line F');

INSERT INTO Bus_Lines(name) VALUES ('BLine A01');
INSERT INTO Bus_Lines(name) VALUES ('BLine A02');
INSERT INTO Bus_Lines(name) VALUES ('BLine A03');
INSERT INTO Bus_Lines(name) VALUES ('BLine B01');
INSERT INTO Bus_Lines(name) VALUES ('BLine B02');
INSERT INTO Bus_Lines(name) VALUES ('BLine B03');
INSERT INTO Bus_Lines(name) VALUES ('BLine C01');
INSERT INTO Bus_Lines(name) VALUES ('BLine C02');
INSERT INTO Bus_Lines(name) VALUES ('BLine C03');
INSERT INTO Bus_Lines(name) VALUES ('BLine D01');
INSERT INTO Bus_Lines(name) VALUES ('BLine D02');
INSERT INTO Bus_Lines(name) VALUES ('BLine D03');
INSERT INTO Bus_Lines(name) VALUES ('BLine E01');
INSERT INTO Bus_Lines(name) VALUES ('BLine E02');
INSERT INTO Bus_Lines(name) VALUES ('BLine E03');
INSERT INTO Bus_Lines(name) VALUES ('BLine F01');
INSERT INTO Bus_Lines(name) VALUES ('BLine F02');
INSERT INTO Bus_Lines(name) VALUES ('BLine F03');

INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (1,5);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (1,6);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (1,7);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,1);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,2);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,7);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,3);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,4);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,5);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,6);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,7);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,1);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,3);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,6);


