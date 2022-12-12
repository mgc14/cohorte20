SELECT * FROM tiendita.categoria;

SELECT * FROM productos;

SELECT nombre, precio, existencia FROM productos where idCategoria >2;
/* max(), min ()*/
select min(existencia) as existencia_minima, max(existencia) as existencia_maxima from productos;
/*limit*/
select * from productos limit 2, 8;

select * from productos order by nombre asc;
