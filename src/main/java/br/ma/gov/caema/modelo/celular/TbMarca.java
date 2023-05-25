package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_marca database table.
 * 
 */
@Entity
@Table(name="tb_marca")
@NamedQuery(name="TbMarca.findAll", query="SELECT t FROM TbMarca t")
public class TbMarca extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_MARCA_IDMARCA_GENERATOR", sequenceName="TB_MARCA_ID_MARCA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_MARCA_IDMARCA_GENERATOR")
	@Column(name="id_marca")
	private Long idMarca;

	private String descricao;

	//bi-directional many-to-one association to TbModelo
	@OneToMany(mappedBy="tbMarca")
	private List<TbModelo> tbModelos;

	public TbMarca() {
	}
}