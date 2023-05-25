package br.ma.gov.caema.modelo.email;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_email database table.
 * 
 */
@Entity
@Table(name="tb_email")
@NamedQuery(name="TbEmail.findAll", query="SELECT t FROM TbEmail t")
public class TbEmail extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_EMAIL_IDEMAIL_GENERATOR", sequenceName="$TB_ID_EMAIL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_EMAIL_IDEMAIL_GENERATOR")
	@Column(name="id_email")
	private Integer idEmail;

	private String email;

	private String matricula;

	public TbEmail() {
	}
}