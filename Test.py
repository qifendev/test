#!/usr/bin/python3
import random
poke_card = ["A","2","3","4","5","6","7","8","9","10","J","Q","K"]
poke_type = ["♠","♣","♥","◆"]
poke_all = []
for i in poke_card:
    for j in poke_type:
        poke_all.append(i + " " + j)
poke_all.append("X ")
poke_all.append("Y ")
random.shuffle(poke_all)
print("play1: {0}".format(poke_all[0:17]))
print("play2: {0}".format(poke_all[17:34]))
print("play3: {0}".format(poke_all[34:51]))
print("bottom: {0}".format(poke_all[50:53]))



