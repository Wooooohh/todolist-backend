DROP TABLE IF EXISTS item;

CREATE TABLE item (

  id INT AUTO_INCREMENT  PRIMARY KEY,

  content VARCHAR(100),

  status BOOLEAN
);

insert into item values(1,'hello' , 'false') , (2, 'world' , 'true');