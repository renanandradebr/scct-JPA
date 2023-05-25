package br.ma.gov.caema.modelo.email;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_email_aux_2 database table.
 * 
 */
@Entity
@Table(name="tb_email_aux_2")
@NamedQuery(name="TbEmailAux2.findAll", query="SELECT t FROM TbEmailAux2 t")
public class TbEmailAux2 extends  PanacheEntityBase{

	@Column(name="email_aux")
	private String emailAux;

	@Column(name="matricula_aux")
	private String matriculaAux;

	public TbEmailAux2() {
	}

}