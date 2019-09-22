package com.tn.isamm.linkedin.entity;
// Generated Oct 21, 2018 10:21:03 AM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.*;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * Experience generated by hbm2java
 */
@Entity
@Table(name="experience"
    ,catalog="linkedin2"
)
public class Experience  implements java.io.Serializable {


     private Integer id;
     private Utilisateur utilisateur;
     private String role;
     private String cause;
     private Date dateDebut;
     private Date dateFin;
     private String description;

    public Experience() {
    }

    public Experience(Utilisateur utilisateur, String role, String cause, Date dateDebut, Date dateFin, String description) {
       this.utilisateur = utilisateur;
       this.role = role;
       this.cause = cause;
       this.dateDebut = dateDebut;
       this.dateFin = dateFin;
       this.description = description;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {this.id = id; }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_utilisateur", nullable=false)
    public Utilisateur getUtilisateur() { return this.utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }

    
    @Column(name="role",  length=1000) //removed nullable=false
    public String getRole() { return this.role; }
    public void setRole(String role) { this.role = role; }

    
    @Column(name="cause",  length=1000)
    public String getCause() { return this.cause; }
    public void setCause(String cause) { this.cause = cause; }

    @Temporal(TemporalType.DATE)
    @Column(name="date_debut",  length=10)
    public Date getDateDebut() { return this.dateDebut; }
    public void setDateDebut(Date dateDebut) { this.dateDebut = dateDebut; }

    @Temporal(TemporalType.DATE)
    @Column(name="date_fin",  length=10)
    public Date getDateFin() { return this.dateFin; }
    public void setDateFin(Date dateFin) { this.dateFin = dateFin; }

    
    @Column(name="description", length=10000)
    public String getDescription() { return this.description; }
    public void setDescription(String description) {
        this.description = description;
    }




}


