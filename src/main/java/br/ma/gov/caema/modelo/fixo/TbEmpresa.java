package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_empresa database table.
 * 
 */
@Entity
@Table(name="tb_empresa")
@NamedQuery(name="TbEmpresa.findAll", query="SELECT t FROM TbEmpresa t")
public class TbEmpresa extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_EMPRESA_IDEMPRESA_GENERATOR", sequenceName="$TB_ID_EMPRESA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_EMPRESA_IDEMPRESA_GENERATOR")
	@Column(name="id_empresa")
	private Long idEmpresa;

	private String cnpj;

	@Column(name="nome_cliente")
	private String nomeCliente;

	@Column(name="razao_social")
	private String razaoSocial;

	private String site;

	//bi-directional many-to-one association to TbUnidade
	@OneToMany(mappedBy="tbEmpresa")
	private List<TbUnidade> tbUnidades;

	public TbEmpresa() {
	}
}