package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_servico database table.
 * 
 */
@Entity
@Table(name="tb_servico")
@NamedQuery(name="TbServico.findAll", query="SELECT t FROM TbServico t")
public class TbServico extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_SERVICO_IDSERVICO_GENERATOR", sequenceName="$TB_ID_SERVICO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_SERVICO_IDSERVICO_GENERATOR")
	@Column(name="id_servico")
	private Long idServico;

	private Integer cod;

	private String descricao;

	//bi-directional many-to-one association to TbLigacao
	@OneToMany(mappedBy="tbServico")
	private List<TbLigacao> tbLigacaos;

	public TbServico() {
	}
}