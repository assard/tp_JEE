# Answers

This file contains the answers to the question of the TP-4

## Part 4

The line : 

    "<property name="hibernate.hbm2ddl.auto">create</property>"

create the database schema.


The line : 
    
    "<property name="hibernate.show_sql">true</property>"

show sql query on the console when the project are running.

The line : 

    "<mapping class="tsi.ensg.jee.hibernate.ex1.Employee"/>"

map class Employee with relation Employee.

## Part 5

To verify that the table content the employee Harry Potter, I open a new terminal on my computer, I execute psql and then :

    SELECT * FROM employee;

And then I look if I find the employee on the response. 