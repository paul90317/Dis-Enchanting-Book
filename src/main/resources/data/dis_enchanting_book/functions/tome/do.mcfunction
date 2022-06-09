execute store result score @s debk.temp run data get entity @s Item.Count
scoreboard players remove @s debk.temp 1
execute store result entity @s Item.Count int 1 run scoreboard players get @s debk.temp
execute if entity @s[scores={debk.temp=..0}] run kill @s