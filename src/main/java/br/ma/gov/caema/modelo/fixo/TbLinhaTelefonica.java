package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_linha_telefonica database table.
 * 
 */
@Entity
@Table(name="tb_linha_telefonica")
@NamedQuery(name="TbLinhaTelefonica.findAll", query="SELECT t FROM TbLinhaTelefonica t")
public class TbLinhaTelefonica extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_LINHA_TELEFONICA_IDLINHATELEFONICA_GENERATOR", sequenceName="$TB_ID_LINHA_TELEFONICA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_LINHA_TELEFONICA_IDLINHATELEFONICA_GENERATOR")
	@Column(name="id_linha_telefonica")
	private Long idLinhaTelefonica;

	@Column(name="cod_ddd")
	private Integer codDdd;

	@Column(name="descricao_produto")
	private String descricaoProduto;

	@Column(name="dia_vencimento")
	private Integer diaVencimento;

	private String especificacao;

	@Column(name="flag_existe")
	private Boolean flagExiste;

	@Column(name="num_telefone")
	private Integer numTelefone;

	//bi-directional many-to-one association to TbLigacao
	@OneToMany(mappedBy="tbLinhaTelefonica")
	private List<TbLigacao> tbLigacaos;

	//bi-directional many-to-one association to TbContrato
	@ManyToOne
	@JoinColumn(name="id_contrato")
	private TbContrato tbContrato;

	//bi-directional many-to-one association to TbDepartamento
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private TbDepartamento tbDepartamento;

	//bi-directional many-to-one association to TbEnderecoInstalacao
	@ManyToOne
	@JoinColumn(name="id_endereco_instalacao")
	private TbEnderecoInstalacao tbEnderecoInstalacao;

	//bi-directional many-to-one association to TbTipoLinha
	@ManyToOne
	@JoinColumn(name="id_tipo_linha")
	private TbTipoLinha tbTipoLinha;

	//bi-directional many-to-one association to TbTelResp
	@OneToMany(mappedBy="tbLinhaTelefonica")
	private List<TbTelResp> tbTelResps;

	public TbLinhaTelefonica() {
	}
}