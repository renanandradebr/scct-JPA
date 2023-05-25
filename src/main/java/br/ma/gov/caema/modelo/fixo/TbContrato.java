package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_contrato database table.
 * 
 */
@Entity
@Table(name="tb_contrato")
@NamedQuery(name="TbContrato.findAll", query="SELECT t FROM TbContrato t")
public class TbContrato extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_CONTRATO_IDCONTRATO_GENERATOR", sequenceName="$TB_ID_CONTRATO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CONTRATO_IDCONTRATO_GENERATOR")
	@Column(name="id_contrato")
	private Long idContrato;

	@Column(name="cod_contrato")
	private String codContrato;

	@Column(name="descricao_contrato")
	private String descricaoContrato;

	@Column(name="numero_contrato")
	private Integer numeroContrato;

	//bi-directional many-to-one association to TbLinhaTelefonica
	@OneToMany(mappedBy="tbContrato")
	private List<TbLinhaTelefonica> tbLinhaTelefonicas;

	public TbContrato() {
	}

}