#!/usr/bin/env python3

import random

file=open("student_data.sql",'w')

count = int(input("Data count: "))

for i in range(count):
    rand = random.randint(0,3)
    line = 'CALL register_student_procedure(\'Onoma%(num)d\',\'Eponimo%(num)d\',\'%(phone)s\',\'Address%(num)d\');\n' %{'num':i+1,'phone':"2310" + "{:06d}".format(i+1)}
    file.write(line)
