package br.ma.gov.caema.modelo.email;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_agenda_email database table.
 * 
 */
@Entity
@Table(name="tb_agenda_email")
@NamedQuery(name="TbAgendaEmail.findAll", query="SELECT t FROM TbAgendaEmail t")
public class TbAgendaEmail extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_AGENDA_EMAIL_IDEMAIL_GENERATOR", sequenceName="$TB_ID_EMAIL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_AGENDA_EMAIL_IDEMAIL_GENERATOR")
	@Column(name="id_email")
	private Integer idEmail;

	private String cargo;

	private String email;

	private String lotacao;

	private String matricula;

	@Column(name="nome_fun")
	private String nomeFun;

	public TbAgendaEmail() {
	}

}