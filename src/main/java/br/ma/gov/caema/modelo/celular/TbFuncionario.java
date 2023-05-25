package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * The persistent class for the tb_funcionario database table.
 * 
 */
@Entity
@Table(name="tb_funcionario")
@NamedQuery(name="TbFuncionario.findAll", query="SELECT t FROM TbFuncionario t")
public class TbFuncionario extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_FUNCIONARIO_IDFUNC_GENERATOR", sequenceName="TB_FUNCIONARIO_ID_FUNC_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_FUNCIONARIO_IDFUNC_GENERATOR")
	@Column(name="id_func")
	private Integer idFunc;

	private String agencia;

	private String bairro;

	private String cargo;

	private String cep;

	private String cidade;

	@Column(name="cod_afastamento")
	private String codAfastamento;

	@Column(name="cod_cargo")
	private String codCargo;

	private String complemento;

	private String cpf;

	@Column(name="data_admissao")
	private String dataAdmissao;

	@Column(name="data_fim_afastamento")
	private String dataFimAfastamento;

	@Column(name="data_ini_afastamento")
	private String dataIniAfastamento;

	@Temporal(TemporalType.DATE)
	@Column(name="data_ncf")
	private Date dataNcf;

	private String endereco;

	private String escolaridade;

	private String funcao;

	@Column(name="id_cargo")
	private Integer idCargo;

	@Column(name="id_filial")
	private Integer idFilial;

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

	private String status;

	private String uf;

	@Column(name="valor_base_diarias")
	private BigDecimal valorBaseDiarias;

	public TbFuncionario() {
	}

}