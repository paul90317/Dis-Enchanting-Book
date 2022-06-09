#check
execute store success score @s debk.temp run data get entity @s Item.tag.Enchantments[0].lvl
execute if score @s debk.temp matches 1 run function dis_enchanting_book:enchantments_obj/do