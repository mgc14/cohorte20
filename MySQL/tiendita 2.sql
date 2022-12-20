/* operadores */
Select * from productos;
select * from productos where idCategoria = 1 and precio = 100;

select * from productos where idCategoria >=3;

Select *from productos where precio is not null;

Select * from productos 
where precio
between 5 and 10;
