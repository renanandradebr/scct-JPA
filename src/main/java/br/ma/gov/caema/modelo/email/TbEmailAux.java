package br.ma.gov.caema.modelo.email;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_email_aux database table.
 * 
 */
@Entity
@Table(name="tb_email_aux")
@NamedQuery(name="TbEmailAux.findAll", query="SELECT t FROM TbEmailAux t")
public class TbEmailAux extends  PanacheEntityBase{

	@Column(name="email_aux")
	private String emailAux;

	@Column(name="matricula_aux")
	private String matriculaAux;

	public TbEmailAux() {
	}
}