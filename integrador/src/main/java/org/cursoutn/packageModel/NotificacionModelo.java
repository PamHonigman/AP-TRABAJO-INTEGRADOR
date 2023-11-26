package org.cursoutn.packageModel;

import jakarta.persistence.*;

@Entity
@Table(name="notificaciones")
public class NotificacionModelo {
    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String nombreNotificacion;
}
