INSERT INTO t_Category (category_name) VALUES
	('Alkoholfrei'), ('Aperitif'), ('Batida'), ('Kaffee'), ('Digestif'), ('Fizz & Collins'),
	('Flips'), ('Herzhaft'), ('Julep'), ('Punches'), ('Shortdrink'), ('Sour'),
	('Tiki'), ('Zwei- und Dreiteiler'), ('Champagner & Wein'), ('Cognac & Brandy'),
	('Gin'), ('Tequila & Mezcal'), ('Vodka'), ('Wermut'), ('Whisky');

INSERT INTO t_Ingredients (ingredients_name) VALUES
	('Zitrone'), ('Limette'), ('Crushed Ice'), ('Rohrzucker'), ('weißer Rum'),
	('Ananassaft'), ('Cream of Coconut'), ('Eiswürfel'), ('Orangensaft'), ('Zitronensaft'),
	('Grenadine-Sirup');

INSERT INTO t_Cocktails (cocktail_name, category_category_id) VALUES
	('Virgin Sunrise', 1), ('Batida de Coco', 3);
	
INSERT INTO t_cocktails_ingredients (cocktail_cocktail_id, ingredients_ingredients_id) VALUES
	(1, 8), (1, 9), (1, 10), (1, 11);
	
INSERT INTO t_Tool (tool_name, tool_description) VALUES
	('Bar Spoons', 'For mixing');

  