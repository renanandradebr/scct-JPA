package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_aparelho database table.
 * 
 */
@Entity
@Table(name="tb_aparelho")
@NamedQuery(name="TbAparelho.findAll", query="SELECT t FROM TbAparelho t")
public class TbAparelho extends  PanacheEntityBase {

	@Id
	@SequenceGenerator(name="TB_APARELHO_IDAPARELHO_GENERATOR", sequenceName="TB_APARELHO_ID_APARELHO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_APARELHO_IDAPARELHO_GENERATOR")
	@Column(name="id_aparelho")
	private Long idAparelho;

	private String acessorios;

	private String serie;

	//bi-directional many-to-one association to TbEmpregado
	@ManyToOne
	@JoinColumn(name="id_empregado")
	private TbEmpregado tbEmpregado;

	//bi-directional many-to-one association to TbModelo
	@ManyToOne
	@JoinColumn(name="id_modelo")
	private TbModelo tbModelo;

	//bi-directional many-to-one association to TbStatusAparelho
	@OneToMany(mappedBy="tbAparelho")
	private List<TbStatusAparelho> tbStatusAparelhos;

	public TbAparelho() {
	}

}