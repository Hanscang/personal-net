use personalnet;
CREATE TABLE t_user (
    id INT PRIMARY KEY AUTO_INCREMENT, -- 主键
    name VARCHAR(20),
    phone VARCHAR(20),
    sex CHAR(2)
);

CREATE TABLE t_experience (
    id INT PRIMARY KEY AUTO_INCREMENT, -- 主键
    biographicId INT,
    title VARCHAR(32),
    exp VARCHAR(1024),
    ord INT
);

CREATE TABLE t_biographical_notes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(16),
    birthday DATE,
    email varchar(64),
    university varchar(64),
    graduation_date DATE,
    sex varchar(8),
    skill varchar(1024)

);



show tables;