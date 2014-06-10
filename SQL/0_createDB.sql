
create user "jhon" WITH  CREATEDB CREATEUSER PASSWORD 'hammond';

CREATE DATABASE JurassicPark WITH OWNER = "jhon";

GRANT ALL PRIVILEGES ON DATABASE JurassicPark to jhon;
