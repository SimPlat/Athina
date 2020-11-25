#!/usr/bin/env python3

import random

type = ['student','secretary','professor','admin']
tp = ['st','se','pr','ad']

file=open("user_data.sql",'w')

count = int(input("Data count: "))

for i in range(count):
    rand = random.randint(0,3)
    line = 'INSERT INTO user VALUES (NULL,\'%(type)s\',NULL,NULL,\'Onoma%(num)d\',\'Eponimo%(num)d\',NULL,\'%(phone)s\',\'Address%(num)d\');\n' %{'num':i+1, 'tp':tp[rand], 'type':type[rand], 'phone':"2310" + "{:06d}".format(i+1)}
    file.write(line)
