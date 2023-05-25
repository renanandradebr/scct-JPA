package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * The persistent class for the tb_funcionario_x database table.
 * 
 */
@Entity
@Table(name="tb_funcionario_x")
@NamedQuery(name="TbFuncionarioX.findAll", query="SELECT t FROM TbFuncionarioX t")
public class TbFuncionarioX extends  PanacheEntityBase{

	private String agencia;

	private String bairro;

	private String cargo;

	private String cep;

	private String cidade;

	@Column(name="cod_afastamento")
	private String codAfastamento;

	@Column(name="cod_cargo")
	private String codCargo;

	@Column(name="cod_estabelecimento")
	private String codEstabelecimento;

	@Column(name="cod_estcivil")
	private String codEstcivil;

	private String complemento;

	private String cpf;

	@Column(name="data_admissao")
	private String dataAdmissao;

	@Column(name="data_demissao")
	private String dataDemissao;

	@Column(name="data_fim_afastamento")
	private String dataFimAfastamento;

	@Column(name="data_ini_afastamento")
	private String dataIniAfastamento;

	@Temporal(TemporalType.DATE)
	@Column(name="data_ncf")
	private Date dataNcf;

	@Column(name="desc_aposent")
	private String descAposent;

	@Column(name="desc_estcivil")
	private String descEstcivil;

	@Column(name="email_c")
	private String emailC;

	@Column(name="email_p")
	private String emailP;

	private String endereco;

	private String escolaridade;

	private String funcao;

	@Column(name="id_cargo")
	private Integer idCargo;

	@Column(name="id_filial")
	private Integer idFilial;

	@Column(name="id_func")
	private Long idFunc;

	@Column(name="id_funcao")
	private Integer idFuncao;

	@Column(name="id_lotacao")
	private Integer idLotacao;

	@Column(name="imp_st")
	private String impSt;

	private String localidade;

	private String lotacao;

	private String matricula;

	private String nivel;

	private String nome;

	@Column(name="nome_mae")
	private String nomeMae;

	@Column(name="nome_pai")
	private String nomePai;

	@Column(name="num_banco")
	private String numBanco;

	@Column(name="num_conta")
	private String numConta;

	@Column(name="num_lotacao")
	private String numLotacao;

	@Column(name="num_ordem")
	private String numOrdem;

	private String numero;

	private String pispasep;

	private String rg;

	private String sexo;

	@Column(name="sigla_estabelecimento")
	private String siglaEstabelecimento;

	private String status;

	@Column(name="t_cell")
	private String tCell;

	@Column(name="t_fixo")
	private String tFixo;

	@Column(name="tip_aposent")
	private String tipAposent;

	private String uf;

	@Column(name="valor_base_diarias")
	private BigDecimal valorBaseDiarias;

	public TbFuncionarioX() {
	}

}