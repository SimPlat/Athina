#!/usr/bin/env python3

import random

type = ['st','se','pr','ad']

file=open("drop_data.sql",'w')

count = int(input("Data count: "))

for i in range(count):
   for j in range(4):
    line = 'DROP user \'%(type)s%(num)s\'@\'localhost\';\n' %{'num':"{:05d}".format(i+1),'type':type[j]}
    file.write(line)
