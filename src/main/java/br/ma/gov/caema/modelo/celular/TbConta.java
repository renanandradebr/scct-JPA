package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_conta database table.
 * 
 */
@Entity
@Table(name="tb_conta")
@NamedQuery(name="TbConta.findAll", query="SELECT t FROM TbConta t")
public class TbConta extends  PanacheEntityBase{
	@Id
	@SequenceGenerator(name="TB_CONTA_IDCONTA_GENERATOR", sequenceName="TB_CONTA_ID_CONTA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CONTA_IDCONTA_GENERATOR")
	@Column(name="id_conta")
	private Long idConta;

	@Column(name="mes_ano")
	private Integer mesAno;

	//bi-directional many-to-one association to TbChipTelefonicoConta
	@OneToMany(mappedBy="tbConta")
	private List<TbChipTelefonicoConta> tbChipTelefonicoContas;

	public TbConta() {
	}
}