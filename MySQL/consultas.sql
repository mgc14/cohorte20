/*subconsultas*/
select * from productos
where idCategoria = 2 and precio > 10 and existencia between 5 and 20 and fecha_alta is not null;