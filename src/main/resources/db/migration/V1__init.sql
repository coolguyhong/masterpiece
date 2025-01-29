create table masterpiece_user (
    id varchar(40) not null,
    user_id varchar(20) not null,
    password varchar(20) not null,
    name varchar(10) not null,
    phone varchar(20) not null,
    email varchar(40) not null,
    type varchar(20),
    role varchar(10),
    created_by varchar(40),
    created_dt timestamp default current_timestamp,
    modified_by varchar(40),
    modified_dt timestamp default current_timestamp,
    primary key (id)
);

create table real_estate (
    id varchar(40) not null,
    owner_name varchar(10) not null,
    road_address varchar(100) not null,
    parcel_address varchar(100) not null,
    postcode varchar(10) not null,
    building_name varchar(40) not null,
    detail_address varchar(100) not null,
    supply_area decimal(8,4) not null,
    exclusive_area decimal(8,4) not null,
    purchase_date date not null,
    purchase_price bigint not null,
    kb_market_price bigint,
    tech_market_price bigint,
    public_market_price bigint,
    housing_rental_business_yn char(1) not null,
    housing_rental_type varchar(20),
    housing_rental_start_dt date,
    housing_rental_duty_end_dt date,
    created_by varchar(40),
    created_dt timestamp default current_timestamp,
    modified_by varchar(40),
    modified_dt timestamp default current_timestamp,
    primary key (id)
);

create table real_estate_history (
    id varchar(40) not null,
    memo text,
    created_by varchar(40),
    created_dt timestamp default current_timestamp,
    modified_by varchar(40),
    modified_dt timestamp default current_timestamp,
    primary key (id)
);

create table real_estate_to_real_estate_history (
    real_estate_id varchar(40) not null,
    real_estate_history_id varchar(40) not null,
    created_by varchar(40),
    created_dt timestamp default current_timestamp,
    primary key (real_estate_id, real_estate_history_id),
    foreign key (real_estate_id) references real_estate(id),
    foreign key (real_estate_history_id) references real_estate_history(id)
);