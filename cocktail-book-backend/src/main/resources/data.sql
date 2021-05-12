
-- Creation of the table t_Category

DROP TABLE IF EXISTS t_Category;

CREATE TABLE t_Category (
  category_id INT AUTO_INCREMENT  PRIMARY KEY,
  category_name VARCHAR(250) NOT NULL
);

INSERT INTO t_Category (category_name) VALUES
  ('Alkoholfrei'), ('Aperitif'), ('Batida'), ('Kaffee'), ('Digestif'), ('Fizz & Collins'),
  ('Flips'), ('Herzhaft'), ('Julep'), ('Punches'), ('Shortdrink'), ('Sour'),
  ('Tiki'), ('Zwei- und Dreiteiler'), ('Champagner & Wein'), ('Cognac & Brandy'),
  ('Gin'), ('Tequila & Mezcal'), ('Vodka'), ('Wermut'), ('Whisky');

-- Creation of the table t_Cocktails

DROP TABLE IF EXISTS t_Cocktails;

CREATE TABLE t_Cocktails (
  cocktail_id INT AUTO_INCREMENT,
  cocktail_name VARCHAR(250) NOT NULL,
  category_id INT NOT NULL,
  PRIMARY KEY (cocktail_id),
  FOREIGN KEY (category_id) REFERENCES t_Category(category_id)
);

INSERT INTO t_Cocktails (cocktail_name, category_id) VALUES
  ('Virgin Sunrise', 2), ('Batida de Coco', 3);
  