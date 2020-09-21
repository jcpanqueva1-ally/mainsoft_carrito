package com.mainsoft.carrito.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String nombre;

    //en dado caso quisieramos tener la relacion en doble sentido
    //podemos poner la relaciòn aquì
    //en el manyTomany el mappedBy se pone el dueño de la relación
	/*@ManyToMany(mappedBy="roles")
	private List<Usuario>usuarios;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
