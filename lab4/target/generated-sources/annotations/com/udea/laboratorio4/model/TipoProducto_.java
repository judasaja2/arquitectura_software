package com.udea.laboratorio4.model;

import com.udea.laboratorio4.model.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-21T13:27:12")
@StaticMetamodel(TipoProducto.class)
public class TipoProducto_ { 

    public static volatile SingularAttribute<TipoProducto, String> tipoProducto;
    public static volatile SingularAttribute<TipoProducto, Long> id;
    public static volatile ListAttribute<TipoProducto, Producto> productos;

}