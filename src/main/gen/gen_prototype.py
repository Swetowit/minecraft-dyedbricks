# -*- coding: utf-8 -*

import json, io

colors = ['white','light_gray','gray','black','blue','light_blue','cyan','green','lime','brown','magenta','pink','purple','orange','red','yellow']

def blockstates_gen():
	for color in colors:
		blockstates = {"bricks": {"variants": {"": { "model": "dyedbricks:block/"+color+"_"+"bricks" }}}, "brick_wall": {"multipart": [{   "when": { "up": "true" },"apply": { "model": "dyedbricks:block/"+color+"_brick_wall_post" }},{   "when": { "north": "true" },"apply": { "model": "dyedbricks:block/"+color+"_brick_wall_side", "uvlock": True }},{   "when": { "east": "true" },"apply": { "model": "dyedbricks:block/"+color+"_brick_wall_side", "y": 90, "uvlock": True }},{   "when": { "south": "true" },"apply": { "model": "dyedbricks:block/"+color+"_brick_wall_side", "y": 180, "uvlock": True }},{   "when": { "west": "true" },"apply": { "model": "dyedbricks:block/"+color+"_brick_wall_side", "y": 270, "uvlock": True }}]}, "brick_slab": {"variants": {"type=bottom": { "model": "dyedbricks:block/"+color+"_"+"brick_slab" },"type=top": { "model": "dyedbricks:block/"+color+"_"+"brick_slab_top" },"type=double": { "model": "dyedbricks:block/"+color+"_"+"bricks" }}}, "brick_stairs": {"variants": {"facing=east,half=bottom,shape=straight":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs" },"facing=west,half=bottom,shape=straight":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "y": 180, "uvlock": True },"facing=south,half=bottom,shape=straight": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "y": 90, "uvlock": True },"facing=north,half=bottom,shape=straight": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "y": 270, "uvlock": True },"facing=east,half=bottom,shape=outer_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer" },"facing=west,half=bottom,shape=outer_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "y": 180, "uvlock": True },"facing=south,half=bottom,shape=outer_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "y": 90, "uvlock": True },"facing=north,half=bottom,shape=outer_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "y": 270, "uvlock": True },"facing=east,half=bottom,shape=outer_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "y": 270, "uvlock": True },"facing=west,half=bottom,shape=outer_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "y": 90, "uvlock": True },"facing=south,half=bottom,shape=outer_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer" },"facing=north,half=bottom,shape=outer_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "y": 180, "uvlock": True },"facing=east,half=bottom,shape=inner_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner" },"facing=west,half=bottom,shape=inner_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "y": 180, "uvlock": True },"facing=south,half=bottom,shape=inner_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "y": 90, "uvlock": True },"facing=north,half=bottom,shape=inner_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "y": 270, "uvlock": True },"facing=east,half=bottom,shape=inner_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "y": 270, "uvlock": True },"facing=west,half=bottom,shape=inner_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "y": 90, "uvlock": True },"facing=south,half=bottom,shape=inner_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner" },"facing=north,half=bottom,shape=inner_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "y": 180, "uvlock": True },"facing=east,half=top,shape=straight":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "x": 180, "uvlock": True },"facing=west,half=top,shape=straight":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "x": 180, "y": 180, "uvlock": True },"facing=south,half=top,shape=straight": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "x": 180, "y": 90, "uvlock": True },"facing=north,half=top,shape=straight": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs", "x": 180, "y": 270, "uvlock": True },"facing=east,half=top,shape=outer_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "y": 90, "uvlock": True },"facing=west,half=top,shape=outer_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "y": 270, "uvlock": True },"facing=south,half=top,shape=outer_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "y": 180, "uvlock": True },"facing=north,half=top,shape=outer_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "uvlock": True },"facing=east,half=top,shape=outer_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "uvlock": True },"facing=west,half=top,shape=outer_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "y": 180, "uvlock": True },"facing=south,half=top,shape=outer_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "y": 90, "uvlock": True },"facing=north,half=top,shape=outer_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_outer", "x": 180, "y": 270, "uvlock": True },"facing=east,half=top,shape=inner_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "y": 90, "uvlock": True },"facing=west,half=top,shape=inner_right":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "y": 270, "uvlock": True },"facing=south,half=top,shape=inner_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "y": 180, "uvlock": True },"facing=north,half=top,shape=inner_right": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "uvlock": True },"facing=east,half=top,shape=inner_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "uvlock": True },"facing=west,half=top,shape=inner_left":  { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "y": 180, "uvlock": True },"facing=south,half=top,shape=inner_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "y": 90, "uvlock": True },"facing=north,half=top,shape=inner_left": { "model": "dyedbricks:block/"+color+"_"+"brick_stairs_inner", "x": 180, "y": 270, "uvlock": True }}}}
		for key, item in blockstates.items():
			with open(color+"_"+key+".json","w") as f:
				json.dump(blockstates[key], f, indent=4)
	return None

def models_block_gen():
	for color in colors:
		models_block = {"brick_slab_top": {"parent": "block/slab_top","textures": {"bottom": "dyedbricks:block/"+color+"_"+"bricks","top": "dyedbricks:block/"+color+"_"+"bricks","side": "dyedbricks:block/"+color+"_"+"bricks"}}, "brick_stairs": {"parent": "block/stairs","textures": {"bottom": "dyedbricks:block/"+color+"_"+"bricks","top": "dyedbricks:block/"+color+"_"+"bricks","side": "dyedbricks:block/"+color+"_"+"bricks"}}, "brick_stairs_outer": {"parent": "block/outer_stairs","textures": {"bottom": "dyedbricks:block/"+color+"_"+"bricks","top": "dyedbricks:block/"+color+"_"+"bricks","side": "dyedbricks:block/"+color+"_"+"bricks"}}, "brick_stairs_inner": {"parent": "block/inner_stairs","textures": {"bottom": "dyedbricks:block/"+color+"_"+"bricks","top": "dyedbricks:block/"+color+"_"+"bricks","side": "dyedbricks:block/"+color+"_"+"bricks"}}, "brick_wall_inventory": {"parent": "block/wall_inventory","textures": {"wall": "dyedbricks:block/"+color+"_bricks"}}, "brick_wall_post": {"parent": "block/template_wall_post","textures": {"wall": "dyedbricks:block/"+color+"_bricks"}}, "brick_wall_side": {"parent": "block/template_wall_side","textures": {"wall": "dyedbricks:block/"+color+"_bricks"}}, "bricks": {"parent": "block/cube_all","textures": {"all": "dyedbricks:block/"+color+"_"+"bricks"}}, "brick_slab": {"parent": "block/slab","textures": {"bottom": "dyedbricks:block/"+color+"_"+"bricks","top": "dyedbricks:block/"+color+"_"+"bricks","side": "dyedbricks:block/"+color+"_"+"bricks"}}}
		for key, item in models_block.items():
			with open(color+"_"+key+".json","w") as f:
				json.dump(models_block[key], f, indent=4)
	return None

def models_item_gen():
	for color in colors:
		models_item = {"brick": {"parent": "item/generated","textures": {"layer0": "dyedbricks:item/"+color+"_"+"brick"}}, "brick_slab": {"parent": "dyedbricks:block/"+color+"_"+"brick_slab"}, "brick_stairs": {"parent": "dyedbricks:block/"+color+"_"+"brick_stairs"}, "brick_wall": {"parent": "dyedbricks:block/"+color+"_"+"brick_wall_inventory"}, "bricks": {"parent": "dyedbricks:block/"+color+"_"+"bricks"}}
		for key, item in models_item.items():
			with open(color+"_"+key+".json","w") as f:
				json.dump(models_item[key], f, indent=4)
	return None

def loot_tables_blocks_gen():
	for color in colors:
		loot_tables = {"brick_slab": {"type": "minecraft:block","pools": [{"rolls": 1,"entries": [{"type": "minecraft:item","functions": [{"function": "minecraft:set_count","conditions": [{"condition": "minecraft:block_state_property","block": "dyedbricks:"+color+"_"+"brick_slab","properties": {"type": "double"}}],"count": 2},{"function": "minecraft:explosion_decay"}],"name": "dyedbricks:"+color+"_"+"brick_slab"}]}]}, "brick_stairs": {"type": "minecraft:block","pools": [{"rolls": 1,"entries": [{"type": "minecraft:item","name": "dyedbricks:"+color+"_"+"brick_stairs"}],"conditions": [{"condition": "minecraft:survives_explosion"}]}]}, "brick_wall": {"type": "minecraft:block","pools": [{"rolls": 1,"entries": [{"type": "minecraft:item","name": "dyedbricks:"+color+"_"+"brick_wall"}],"conditions": [{"condition": "minecraft:survives_explosion"}]}]}, "bricks": {"type": "minecraft:block","pools": [{"rolls": 1,"entries": [{"type": "minecraft:item","name": "dyedbricks:"+color+"_"+"bricks"}],"conditions": [{"condition": "minecraft:survives_explosion"}]}]}}
		for key, item in loot_tables.items():
			with open(color+"_"+key+".json","w") as f:
				json.dump(loot_tables[key], f, indent=4)
	return None

def recipes_gen():
	for color in colors:
		recipes = {"brick": {"type": "minecraft:crafting_shaped","pattern": ["###","#X#","###"],"key": {"#": {"item": "minecraft:brick"},"X": {"item": "minecraft:"+color+"_dye"}},"result": {"item": "dyedbricks:"+color+"_brick","count": 8}}, "brick_wall": {"type": "minecraft:crafting_shaped","pattern": ["###","###"],"key": {"#": {"item": "dyedbricks:"+color+"_"+"bricks"}},"result": {"item": "dyedbricks:"+color+"_"+"brick_wall","count": 6}}, "brick_slab": {"type": "minecraft:crafting_shaped","pattern": ["###"],"key": {"#": {"item": "dyedbricks:"+color+"_"+"bricks"}},"result": {"item": "dyedbricks:"+color+"_"+"brick_slab","count": 6}}, "brick_slab_from_bricks_stonecutting": {"type": "minecraft:stonecutting","ingredient": {"item": "dyedbricks:"+color+"_"+"bricks"},"result": "dyedbricks:"+color+"_"+"brick_slab","count": 2}, "brick_stairs": {"type": "minecraft:crafting_shaped","pattern": ["#  ","## ","###"],"key": {"#": {"item": "dyedbricks:"+color+"_"+"bricks"}},"result": {"item": "dyedbricks:"+color+"_"+"brick_stairs","count": 4}}, "brick_stairs_from_bricks_stonecutting": {"type": "minecraft:stonecutting","ingredient": {"item": "dyedbricks:"+color+"_"+"bricks"},"result": "dyedbricks:"+color+"_"+"brick_stairs","count": 1}, "brick_wall_from_bricks_stonecutting": {"type": "minecraft:stonecutting","ingredient": {"item": "dyedbricks:"+color+"_"+"bricks"},"result": "dyedbricks:"+color+"_"+"brick_wall","count": 1}, "bricks": {"type": "minecraft:crafting_shaped","pattern": ["##","##"],"key": {"#": {"item": "dyedbricks:"+color+"_"+"brick"}},"result": {"item": "dyedbricks:"+color+"_"+"bricks"}}}
		for key, item in recipes.items():
			with open(color+"_"+key+".json","w") as f:
				json.dump(recipes[key], f, indent=4)
	return None

Colors = ['White','LightGray','Gray','Black','Blue','LightBlue','Cyan','Green','Lime','Brown','Magenta','Pink','Purple','Orange','Red','Yellow']
COLORS = ['WHITE','LIGHTGRAY','GRAY','BLACK','BLUE','LIGHTBLUE','CYAN','GREEN','LIME','BROWN','MAGENTA','PINK','PURPLE','ORANGE','RED','YELLOW']
blocks = ['bricks', 'brick_stairs', 'brick_slab', 'brick_wall']
Blocks = ['BrickStairs', 'BrickSlab', 'BrickWall']
BLOCKS = ['BRICK_STAIRS', 'BRICK_SLAB', 'BRICK_WALL']

def lines_main_java():
	instanciation = ""
	registration = ""
	for i in range(len(Blocks)):
		for j in range(len(Colors)):
			instanciation += "\t public static final Block "+COLORS[j]+"_"+BLOCKS[i]+" = new "+Colors[j]+Blocks[i]+"();\n"
			registration += '\t\t Registry.register(Registry.BLOCK, new Identifier("dyedbricks","'+colors[j]+'_'+blocks[i]+'"), '+COLORS[j]+"_"+BLOCKS[i]+');\n\t\t Registry.register(Registry.ITEM, new Identifier("dyedbricks","'+colors[j]+'_'+blocks[i]+'"), new BlockItem('+COLORS[j]+'_'+BLOCKS[i]+', new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );\n'
	with open("lines_java.txt","w") as f:
		f.write(instanciation+"\n\n"+registration)
	return None

items = ['brick', 'bricks', 'brick_stairs', 'brick_slab', 'brick_wall']

English_Lang_colors = ['White','Light Gray','Gray','Black','Blue','Light Blue','Cyan','Green','Lime','Brown','Magenta','Pink','Purple','Orange','Red','Yellow']

English_Lang_items = ['Brick', 'Bricks', 'Brick Stairs', 'Brick Slab', 'Brick Wall']

English_Lang_block = ['Bricks', 'Brick Stairs', 'Brick Slab', 'Brick Wall']

def lang_file_en(lang,lang_colors, lang_items, lang_blocks):
	lang_file = {}
	for i in range(len(lang_items)):
		for j in range(len(lang_colors)):
			lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[i]: lang_colors[j]+" "+lang_items[i]})
	for i in range(len(lang_blocks)):
		for j in range(len(lang_colors)):
			lang_file.update({"block.dyedbricks."+colors[j]+"_"+blocks[i]: lang_colors[j]+" "+lang_blocks[i]})
	with open(lang+".json","w") as f:
		json.dump(lang_file, f, indent=4)
	return None

French_Lang_colors = ['blanche','gris clair','grise','noire','bleue','bleu ciel','cyan','verte','vert clair','marron','magenta','rose','violette','orange','rouge','jaune']

French_Lang_items = ['Brique', 'Briques', 'Escalier en briques', 'Dalle en briques', 'Muret en briques']

French_Lang_block = ['Briques', 'Escalier en briques', 'Dalle en briques', 'Muret en briques']

def lang_file_fr(lang,lang_colors, lang_items, lang_blocks):
	lang_file = {}
	#singulier
	for j in range(len(lang_colors)):
		lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[0]: lang_items[0]+" "+lang_colors[j]})
	#pluriel
	for i in range(1,len(lang_items)):
		for j in range(len(lang_colors)):
			#indéclinable
			if j==1 or j==5 or j==6 or j==8 or j==10:
				lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[i]: lang_items[i]+" "+lang_colors[j]})
			#déclinable
			else:
				lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[i]: lang_items[i]+" "+lang_colors[j]+"s"})
	for i in range(len(lang_blocks)):
		for j in range(len(lang_colors)):
			#indéclinable
			if j==1 or j==5 or j==6 or j==8 or j==10:
				lang_file.update({"block.dyedbricks."+colors[j]+"_"+blocks[i]: lang_blocks[i]+" "+lang_colors[j]})
			#déclinable
			else:
				lang_file.update({"block.dyedbricks."+colors[j]+"_"+blocks[i]: lang_blocks[i]+" "+lang_colors[j]+"s"})
	with open(lang+".json","w") as f:
		json.dump(lang_file, f, indent=4)
	return None

German_Lang_colors = ['Weiß','Hellgrau','Grau','Schwarz','Blau','Hellblau','Türkis','Grün','Hellgrün','Braun','Magenta','Rosa','Violette','Orange','Rot','Gelb']

German_Lang_items = ['Ziegel', 'Ziegelsteine', 'Ziegeltreppe', 'Ziegelstufe', 'Ziegelsteinmauer']

German_Lang_block = ['Ziegelsteine', 'Ziegeltreppe', 'Ziegelstufe', 'Ziegelmauer']

def lang_file_de(lang,lang_colors, lang_items, lang_blocks):
	lang_file = {}
	#Ziegel und Ziegelblock - masculinum
	for j in range(len(lang_colors)):
		lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[0]: lang_colors[j]+"er"+" "+lang_items[0]})
	#Ziegeltreppe und Ziegelstufe und Ziegelmauer - femininum
	for j in range(len(lang_colors)):
		for i in range(1,5):
			lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[i]: lang_colors[j]+"e"+" "+lang_items[i]})
			lang_file.update({"block.dyedbricks."+colors[j]+"_"+blocks[i-1]: lang_colors[j]+"e"+" "+lang_blocks[i-1]})
	with io.open(lang+".json","w",encoding='utf8') as f:
		json.dump(lang_file, f, indent=4, ensure_ascii=False)
	return None

Russian_Lang_colors = ['Бел','Светло-сер','Сер','Черн','Син','Голуб','Бирюзов','Зелен','Лаймов','Коричнев','Пурпурн','Розов','Фиолетов','Оранжев','Красн','Желт']

Russian_Lang_items = ['кирпич', 'кирпичи', 'кирпичные ступеньки', 'кирпичная плита', 'кирпичная ограда']

Russian_Lang_block = ['кирпичи', 'кирпичные ступеньки', 'кирпичная плита', 'кирпичная ограда']

def lang_file_ru(lang,lang_colors, lang_items, lang_blocks):
	lang_file = {}
	#Masc
	for j in range(len(lang_colors)):
		if j==5:
			lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[0]: lang_colors[j]+"ой"+" "+lang_items[0]})
		else:
			lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[0]: lang_colors[j]+"ый"+" "+lang_items[0]})
	#Fem
	for j in range(len(lang_colors)):
		for i in range(3,5):
			lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[i]: lang_colors[j]+"ая"+" "+lang_items[i]})
			lang_file.update({"block.dyedbricks."+colors[j]+"_"+blocks[i-1]: lang_colors[j]+"ая"+" "+lang_blocks[i-1]})
	#Plur
	for j in range(len(lang_colors)):
		for i in range(1,3):
			lang_file.update({"item.dyedbricks."+colors[j]+"_"+items[i]: lang_colors[j]+"ые"+" "+lang_items[i]})
			lang_file.update({"block.dyedbricks."+colors[j]+"_"+blocks[i-1]: lang_colors[j]+"ые"+" "+lang_blocks[i-1]})
	with io.open(lang+".json","w",encoding="utf8") as f:
		json.dump(lang_file, f, indent=4, ensure_ascii=False)
	return None

def main():
	#blockstates_gen()
	#models_block_gen()
	#models_item_gen()
	#loot_tables_blocks_gen()
	#recipes_gen()
	#lines_main_java()
	#lang_file_en("en_us",English_Lang_colors,English_Lang_items,English_Lang_block)
	#lang_file_fr("fr_fr",French_Lang_colors,French_Lang_items,French_Lang_block)
	#lang_file_de("de_de",German_Lang_colors,German_Lang_items,German_Lang_block)
	lang_file_ru("ru_ru",Russian_Lang_colors,Russian_Lang_items,Russian_Lang_block)
	print("Lol")

if __name__ == '__main__':
	main()