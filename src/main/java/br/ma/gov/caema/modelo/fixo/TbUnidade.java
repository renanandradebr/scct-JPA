package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_unidade database table.
 * 
 */
@Entity
@Table(name="tb_unidade")
@NamedQuery(name="TbUnidade.findAll", query="SELECT t FROM TbUnidade t")
public class TbUnidade extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_UNIDADE_IDUNIDADE_GENERATOR", sequenceName="$TB_ID_UNIDADE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_UNIDADE_IDUNIDADE_GENERATOR")
	@Column(name="id_unidade")
	private Long idUnidade;

	@Column(name="codigo_unidade")
	private Integer codigoUnidade;

	@Column(name="descricao_unidade")
	private String descricaoUnidade;

	private Integer ordem;

	//bi-directional many-to-one association to TbLocalidade
	@OneToMany(mappedBy="tbUnidade")
	private List<TbLocalidade> tbLocalidades;

	//bi-directional many-to-one association to TbEmpresa
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private TbEmpresa tbEmpresa;

	public TbUnidade() {
	}
}