package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_modelo database table.
 * 
 */
@Entity
@Table(name="tb_modelo")
@NamedQuery(name="TbModelo.findAll", query="SELECT t FROM TbModelo t")
public class TbModelo extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_MODELO_IDMODELO_GENERATOR", sequenceName="TB_MODELO_ID_MODELO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_MODELO_IDMODELO_GENERATOR")
	@Column(name="id_modelo")
	private Long idModelo;

	private String descricao;

	//bi-directional many-to-one association to TbAparelho
	@OneToMany(mappedBy="tbModelo")
	private List<TbAparelho> tbAparelhos;

	//bi-directional many-to-one association to TbMarca
	@ManyToOne
	@JoinColumn(name="id_marca")
	private TbMarca tbMarca;

	public TbModelo() {
	}
}