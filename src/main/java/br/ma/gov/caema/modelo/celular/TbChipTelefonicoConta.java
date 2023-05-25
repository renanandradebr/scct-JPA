package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_chip_telefonico_conta database table.
 * 
 */
@Entity
@Table(name="tb_chip_telefonico_conta")
@NamedQuery(name="TbChipTelefonicoConta.findAll", query="SELECT t FROM TbChipTelefonicoConta t")
public class TbChipTelefonicoConta extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_CHIP_TELEFONICO_CONTA_IDCHIPTELEFONICOCONTA_GENERATOR", sequenceName="TB_CHIP_TELEFONICO_CONTA_ID_CHIP_TELEFONICO_CONTA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CHIP_TELEFONICO_CONTA_IDCHIPTELEFONICOCONTA_GENERATOR")
	@Column(name="id_chip_telefonico_conta")
	private Long idChipTelefonicoConta;

	private double valor;

	//bi-directional many-to-one association to TbChipTelefonico
	@ManyToOne
	@JoinColumn(name="id_chip_telefonico")
	private TbChipTelefonico tbChipTelefonico;

	//bi-directional many-to-one association to TbConta
	@ManyToOne
	@JoinColumn(name="id_conta")
	private TbConta tbConta;

	public TbChipTelefonicoConta() {
	}

}