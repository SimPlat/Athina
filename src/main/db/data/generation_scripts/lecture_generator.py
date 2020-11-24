#!/usr/bin/env python3

import random

name = ['Programming 1','Mathematics 1','DC Circuits','MySQL Databases',
       'Programming 2','Mathematics 2','AC Circuits','ObjOr Databases',
       'Programming 3','Mathematics 3','Embedded Sy','NoSQL Databases']

sem = [1,1,1,1,
       2,2,2,2,
       3,3,3,3]

man = [0,1]

file=open("data.sql",'w')
file.write("INSERT INTO lecture VALUES ")

count = len(name)

for i in range(count-1):
    rand = random.randint(0,1)
    line = '(%(id)d,\'%(name)s\',\'%(sem)s\',DEFAULT,\'%(man)s\'),' %{'id':i+1, 'name':name[i], 'sem':sem[i], 'man':man[rand]}
    file.write(line)

rand = random.randint(0,1)
line = '(%(id)d,\'%(name)s\',\'%(sem)s\',DEFAULT,\'%(man)s\')' %{'id':count, 'name':name[count-1], 'sem':sem[count-1], 'man':man[rand]}
file.write(line)
