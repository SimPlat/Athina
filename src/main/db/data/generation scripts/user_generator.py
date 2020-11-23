#!/usr/bin/env python3

import random

type = ['student','secretary','professor','admin']

file=open("mass_data.sql",'w')
file.write("INSERT INTO user VALUES ")

count = int(input("Data count: "))

for i in range(count-1):
    rand = random.randint(0,3)
    line = '(%(num)d,\'%(type)s\',\'unm%(num)d\',\'psw%(num)d\',\'nam%(num)d\',\'snm%(num)d\',\'@%(num)d\',%(num)d,\'adr%(num)d\'),' %{'num': i+1, 'type': type[rand]}
    file.write(line)

rand = random.randint(0,3)
line = '(%(num)d,\'%(type)s\',\'unm%(num)d\',\'psw%(num)d\',\'nam%(num)d\',\'snm%(num)d\',\'@%(num)d\',%(num)d,\'adr%(num)d\')' %{'num': count, 'type': type[rand]}
file.write(line)
