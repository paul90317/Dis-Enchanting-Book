#check
execute store success score @s debk.temp run data get entity @s Item.tag.StoredEnchantments[1].lvl
execute if score @s debk.temp matches 1 run function dis_enchanting_book:stored_enchantments_obj/do