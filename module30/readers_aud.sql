create table readers_aud (
	event_id int(11) not null auto_increment,
    event_date datetime not null,
    event_type varchar(10) default null,
	reader_id int(11) not null,
	old_firstname varchar(11),
	new_firstname varchar(11),
    old_lastname varchar(11),
	new_lastname varchar(11),
	old_peselid int(11),
    new_peselid int(11),
    old_vip_level varchar(15),
    new_vip_level varchar(15),
    primary key (`event_id`)
);