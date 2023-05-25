package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_agenda_fixo_old database table.
 * 
 */
@Entity
@Table(name="tb_agenda_fixo_old")
@NamedQuery(name="TbAgendaFixoOld.findAll", query="SELECT t FROM TbAgendaFixoOld t")
public class TbAgendaFixoOld extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_AGENDA_FIXO_OLD_ID_GENERATOR", sequenceName="$TB_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_AGENDA_FIXO_OLD_ID_GENERATOR")
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

	public TbAgendaFixoOld() {
	}

}