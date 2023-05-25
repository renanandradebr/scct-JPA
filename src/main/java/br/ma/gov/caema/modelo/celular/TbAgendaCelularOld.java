
package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


/**
 * The persistent class for the tb_agenda_celular_old database table.
 * 
 */

@Entity
@Table(name="tb_agenda_celular_old")
@NamedQuery(name="TbAgendaCelularOld.findAll", query="SELECT t FROM TbAgendaCelularOld t")
public class TbAgendaCelularOld extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_AGENDA_CELULAR_OLD_ID_GENERATOR", sequenceName="TB_AGENDA_CELULAR_OLD_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_AGENDA_CELULAR_OLD_ID_GENERATOR")
	private Integer id;

	private String cargo;

	private Integer ddd;

	private String funcao;

	private String lotacao;

	private String matricula;

	private String nome;

	@Column(name="num_lotacao")
	private String numLotacao;

	private Integer numero;

	private String observacao;

	public TbAgendaCelularOld() {
	}
}