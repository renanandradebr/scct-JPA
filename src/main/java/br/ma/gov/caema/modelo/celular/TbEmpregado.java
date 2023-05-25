package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_empregado database table.
 * 
 */
@Entity
@Table(name="tb_empregado")
@NamedQuery(name="TbEmpregado.findAll", query="SELECT t FROM TbEmpregado t")
public class TbEmpregado extends  PanacheEntityBase{
	
	@Id
	@SequenceGenerator(name="TB_EMPREGADO_IDEMPREGADO_GENERATOR", sequenceName="TB_EMPREGADO_ID_EMPREGADO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_EMPREGADO_IDEMPREGADO_GENERATOR")
	@Column(name="id_empregado")
	private Long idEmpregado;

	private String cargo;

	private String email;

	private String funcao;

	private String lotacao;

	private String matricula;

	private String nome;

	//bi-directional many-to-one association to TbAparelho
	@OneToMany(mappedBy="tbEmpregado")
	private List<TbAparelho> tbAparelhos;

	//bi-directional many-to-one association to TbChipTelefonico
	@OneToMany(mappedBy="tbEmpregado")
	private List<TbChipTelefonico> tbChipTelefonicos;

	public TbEmpregado() {
	}

}