INSERT INTO Cities(name) VALUES ('City 1'); 
INSERT INTO Cities(name) VALUES ('City 2'); 

INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationA_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationB_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationC_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationD_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationE_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationF_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationG_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('StationH_Street',1234,null,null,1);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('Station1_Street',1234,null,null,2);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('Station2_Street',1234,null,null,2);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('Station3_Street',1234,null,null,2);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('Station4_Street',1234,null,null,2);
INSERT INTO Addresses(street,number,floor,apartment,city_id) VALUES ('Station5_Street',1234,null,null,2);

INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station A',POINT(130,170),1);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station B',POINT(230,270),2);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station C',POINT(250,0),3);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station D',POINT(410,270),4);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station E',POINT(530,130),5);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station F',POINT(340,60),6);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station G',POINT(490,0),7);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station H',POINT(670,220),8);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station 1',POINT(210,450),9);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station 2',POINT(400,450),10);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station 3',POINT(310,540),11);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station 4',POINT(510,540),12);
INSERT INTO Stations(name,coordinates,address_id) VALUES ('Station 5',POINT(240,660),13);

INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,9);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (10,4);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (8,12);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,2);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (2,4);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (4,8);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (4,5);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,5);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (1,3);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (3,6);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (6,7);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (5,7);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (7,8);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (7,2);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (9,10);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (10,12);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (10,11);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (11,13);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (11,9);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (12,11);
INSERT INTO Routes(start_station_id, end_station_id) VALUES (13,12);

INSERT INTO Railway_Lines(name) VALUES ('Line A');
INSERT INTO Railway_Lines(name) VALUES ('Line B');
INSERT INTO Railway_Lines(name) VALUES ('Line C');
INSERT INTO Railway_Lines(name) VALUES ('Line D');
INSERT INTO Railway_Lines(name) VALUES ('Line E');
INSERT INTO Railway_Lines(name) VALUES ('Line F');

INSERT INTO Bus_Lines(name) VALUES ('BLine A01');
INSERT INTO Bus_Lines(name) VALUES ('BLine A02');
INSERT INTO Bus_Lines(name) VALUES ('BLine A03');
INSERT INTO Bus_Lines(name) VALUES ('BLine A04');
INSERT INTO Bus_Lines(name) VALUES ('BLine A05');
INSERT INTO Bus_Lines(name) VALUES ('BLine B01');
INSERT INTO Bus_Lines(name) VALUES ('BLine B02');
INSERT INTO Bus_Lines(name) VALUES ('BLine B03');

------------- UP TO HERE

INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (1,1);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (2,1);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (3,2);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (4,2);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (5,3);
INSERT INTO Railway_Line_Routes(railway_line_id, route_id) VALUES (6,2);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,9);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,10);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,11);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,13);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,6);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,5);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (1,4);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,8);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,12);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,13);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,6);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,5);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,4);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (2,9);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,9);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,10);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,11);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,14);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,4);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,8);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (3,12);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,4);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,5);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,7);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (4,8);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (5,6);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (5,7);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (5,12);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (5,13);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (6,15);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (6,17);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (6,19);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (6,16);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (7,16);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (7,17);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (7,20);

INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (8,17);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (8,18);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (8,20);
INSERT INTO Bus_Line_Routes(bus_line_id, route_id) VALUES (8,21);



