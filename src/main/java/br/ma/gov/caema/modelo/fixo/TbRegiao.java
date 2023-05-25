package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_regiao database table.
 * 
 */
@Entity
@Table(name="tb_regiao")
@NamedQuery(name="TbRegiao.findAll", query="SELECT t FROM TbRegiao t")
public class TbRegiao extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_REGIAO_IDREGIAO_GENERATOR", sequenceName="$TB_ID_REGIAO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_REGIAO_IDREGIAO_GENERATOR")
	@Column(name="id_regiao")
	private Long idRegiao;

	private String descricao;

	//bi-directional many-to-one association to TbDepartamento
	@OneToMany(mappedBy="tbRegiao")
	private List<TbDepartamento> tbDepartamentos;

	public TbRegiao() {
	}
}