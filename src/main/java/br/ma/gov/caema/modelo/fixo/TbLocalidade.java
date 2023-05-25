package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_localidade database table.
 * 
 */
@Entity
@Table(name="tb_localidade")
@NamedQuery(name="TbLocalidade.findAll", query="SELECT t FROM TbLocalidade t")
public class TbLocalidade extends PanacheEntityBase{
	@Id
	@SequenceGenerator(name="TB_LOCALIDADE_IDLOCALIDADE_GENERATOR", sequenceName="$TB_ID_LOCALIDADE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_LOCALIDADE_IDLOCALIDADE_GENERATOR")
	@Column(name="id_localidade")
	private Long idLocalidade;

	@Column(name="codigo_local")
	private Integer codigoLocal;

	@Column(name="descricao_local")
	private String descricaoLocal;

	//bi-directional many-to-one association to TbEnderecoInstalacao
	@OneToMany(mappedBy="tbLocalidade")
	private List<TbEnderecoInstalacao> tbEnderecoInstalacaos;

	//bi-directional many-to-one association to TbUnidade
	@ManyToOne
	@JoinColumn(name="id_unidade")
	private TbUnidade tbUnidade;

	public TbLocalidade() {
	}
}