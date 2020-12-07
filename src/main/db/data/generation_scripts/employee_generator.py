#!/usr/bin/env python3

import random

type = ['secretary','professor','admin']

file=open("employee_data.sql",'w')

count = int(input("Data count: "))

for i in range(count):
    rand = random.randint(0,2)
    line = 'CALL register_employee_procedure(\'%(type)s\',\'Onoma%(num)d\',\'Eponimo%(num)d\',\'%(phone)s\',\'Address%(num)d\');\n' %{'num':i+1,'type':type[rand],'phone':"2310" + "{:06d}".format(i+1)}
    file.write(line)
