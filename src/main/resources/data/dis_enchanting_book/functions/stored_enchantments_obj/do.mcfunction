#do
summon minecraft:item ~ ~ ~ {Item:{id:"minecraft:enchanted_book",Count:1b,tag:{StoredEnchantments:[]}},Motion:[0.0,0.3,0.0]}
data modify entity @e[type=item,nbt={Item:{id:"minecraft:enchanted_book",tag:{StoredEnchantments:[]}}},sort=nearest,limit=1] Item.tag.StoredEnchantments append from entity @s Item.tag.StoredEnchantments[0]
data remove entity @s Item.tag.StoredEnchantments[0]

#special effect
playsound minecraft:entity.blaze.shoot ambient @a ~ ~ ~
particle flame ~ ~1 ~
particle flame ~1 ~ ~1
particle flame ^1 ^ ^-1
particle flame ^ ^1 ^1
particle flame ~-1 ~1 ~-1
particle flame ^-1 ^1 ^1
particle flame ~1 ~2 ~1
particle flame ^1 ^2 ^-1
particle flame ^ ^2 ^1
particle flame ~-1 ~2 ~-1

# book do
execute as @e[type=item,nbt={Item:{id:"dis_enchanting_book:dis_enchanting_book"}},sort=nearest,limit=1] at @s run function dis_enchanting_book:tome/do