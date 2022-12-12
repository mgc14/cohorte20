/* joins */ 
select *from productos;

select * from idCategoria;

select * from productos, categoria
where idCategoria = id;

select p.nombre, p.precio, p.existencia, c.nombre from productos as p INNER join categoria as c 
ON p.idCategoria = c.id;

select p.nombre, p.existencia, t.nombre from proudctos as p left join temp as t 
On p.idCategoria = t.id

select * from categoria UNION 
SELECT * from proveedores;


/*multi consulta*/
select p.nombre as nom_producto, c.nombre, pv  as nom_categoria
FROM productos as p
left join categoria as c
on p.idCategoria = c.id
left join detalle_producto_proveedor as det
on p.idProdcuto=det.idProducto
left join proveedores as pv
on pv.id = ;

