package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import lombok.Data;

/**
 * The persistent class for the tb_status_chip_telefonico database table.
 * 
 */
@Entity
@Table(name="tb_status_chip_telefonico")
@NamedQuery(name="TbStatusChipTelefonico.findAll", query="SELECT t FROM TbStatusChipTelefonico t")
public class TbStatusChipTelefonico extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_STATUS_CHIP_TELEFONICO_IDSTATUSCHIPTELEFONICO_GENERATOR", sequenceName="TB_STATUS_CHIP_TELEFONICO_ID_STATUS_CHIP_TELEFONICO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_STATUS_CHIP_TELEFONICO_IDSTATUSCHIPTELEFONICO_GENERATOR")
	@Column(name="id_status_chip_telefonico")
	private Long idStatusChipTelefonico;

	private String cargo;

	@Column(name="data_mudanca_status")
	private Timestamp dataMudancaStatus;

	private String lotacao;

	private String matricula;

	private String nome;

	private String observacao;

	//bi-directional many-to-one association to TbChipTelefonico
	@ManyToOne
	@JoinColumn(name="id_chip_telefonico")
	private TbChipTelefonico tbChipTelefonico;

	//bi-directional many-to-one association to TbStatus
	@ManyToOne
	@JoinColumn(name="id_status")
	private TbStatus tbStatus;

	public TbStatusChipTelefonico() {
	}
}