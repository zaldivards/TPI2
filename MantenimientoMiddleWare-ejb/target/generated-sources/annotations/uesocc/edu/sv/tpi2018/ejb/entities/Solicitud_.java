package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Calendario;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-02T15:56:29")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, String> unidad;
    public static volatile SingularAttribute<Solicitud, Boolean> estado;
    public static volatile ListAttribute<Solicitud, Calendario> calendarioList;
    public static volatile SingularAttribute<Solicitud, String> solicitante;
    public static volatile ListAttribute<Solicitud, OrdenTrabajo> ordenTrabajoList;
    public static volatile ListAttribute<Solicitud, Equipo> equipoList;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;

}