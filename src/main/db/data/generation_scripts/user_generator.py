#!/usr/bin/env python3

import random

type = ['student','secretary','professor','admin']
tp = ['st','se','pr','ad']

file=open("mass_data.sql",'w')
file.write("INSERT INTO user VALUES ")

count = int(input("Data count: "))

for i in range(count-1):
    rand = random.randint(0,3)
    line = '(%(id)s,\'%(type)s\',\'%(tp)s%(id)s\',\'%(tp)s%(id)s\',\'Onoma%(num)d\',\'Eponimo%(num)d\',\'%(tp)s%(id)s@ihu.gr\',%(phone)s,\'Address%(num)d\'),' %{'num':i+1, 'id':"{:08d}".format(i+1), 'tp':tp[rand], 'type':type[rand], 'phone':"2310" + "{:06d}".format(i+1)}
    file.write(line)

rand = random.randint(0,3)
line = '(%(id)s,\'%(type)s\',\'%(tp)s%(id)s\',\'%(tp)s%(id)s\',\'Onoma%(num)d\',\'Eponimo%(num)d\',\'%(tp)s%(id)s@ihu.gr\',%(phone)s,\'Address%(num)d\')' %{'num':count, 'id':"{:08d}".format(count), 'tp':tp[rand], 'type':type[rand], 'phone':"2310" + "{:06d}".format(count)}
file.write(line)
