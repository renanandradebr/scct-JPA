package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import lombok.Data;

/**
 * The persistent class for the tb_status_aparelho database table.
 * 
 */
@Entity
@Table(name="tb_status_aparelho")
@NamedQuery(name="TbStatusAparelho.findAll", query="SELECT t FROM TbStatusAparelho t")
public class TbStatusAparelho extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_STATUS_APARELHO_IDSTATUSAPARELHO_GENERATOR", sequenceName="TB_STATUS_APARELHO_ID_STATUS_APARELHO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_STATUS_APARELHO_IDSTATUSAPARELHO_GENERATOR")
	@Column(name="id_status_aparelho")
	private Long idStatusAparelho;

	private String cargo;

	@Column(name="data_mudanca_status")
	private Timestamp dataMudancaStatus;

	private String lotacao;

	private String matricula;

	private String nome;

	private String observacao;

	//bi-directional many-to-one association to TbAparelho
	@ManyToOne
	@JoinColumn(name="id_aparelho")
	private TbAparelho tbAparelho;

	//bi-directional many-to-one association to TbStatus
	@ManyToOne
	@JoinColumn(name="id_status")
	private TbStatus tbStatus;

	public TbStatusAparelho() {
	}
}