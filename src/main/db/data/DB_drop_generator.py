#!/usr/bin/env python3

import random

employee = ['se','pr','ad']

file=open("../DB_drop.sql",'w')

st_count = int(input("Student count: "))
em_count = int(input("Employee count: "))

file.write("-- Remove Athina DB\nDROP DATABASE IF EXISTS Athina_db;\n\n-- Get rid of left over Athina users on MySQL server\n")

for i in range(st_count):
   line = 'DROP USER IF EXISTS \'st%(num)s\'@\'%%\';\n' %{'num':"{:05d}".format(i+1)}
   file.write(line)

for j in range(em_count):
   for k in range(3): 
      line = 'DROP USER IF EXISTS \'%(emp)s%(num)s\'@\'%%\';\n' %{'num':"{:05d}".format(i+j+2),'emp':employee[k]}
      file.write(line)
