package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_departamento database table.
 * 
 */
@Entity
@Table(name="tb_departamento")
@NamedQuery(name="TbDepartamento.findAll", query="SELECT t FROM TbDepartamento t")
public class TbDepartamento extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_DEPARTAMENTO_IDDEPARTAMENTO_GENERATOR", sequenceName="$TB_ID_DEPARTAMENTO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_DEPARTAMENTO_IDDEPARTAMENTO_GENERATOR")
	@Column(name="id_departamento")
	private Long idDepartamento;

	private String descricao;

	//bi-directional many-to-one association to TbRegiao
	@ManyToOne
	@JoinColumn(name="id_regiao")
	private TbRegiao tbRegiao;

	//bi-directional many-to-one association to TbLinhaTelefonica
	@OneToMany(mappedBy="tbDepartamento")
	private List<TbLinhaTelefonica> tbLinhaTelefonicas;

	public TbDepartamento() {
	}
}