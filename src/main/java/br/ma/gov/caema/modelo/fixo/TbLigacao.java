package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import lombok.Data;

/**
 * The persistent class for the tb_ligacao database table.
 * 
 */
@Entity
@Table(name="tb_ligacao")
@NamedQuery(name="TbLigacao.findAll", query="SELECT t FROM TbLigacao t")
public class TbLigacao extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_LIGACAO_IDLIGACAO_GENERATOR", sequenceName="$TB_ID_LIGACAO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_LIGACAO_IDLIGACAO_GENERATOR")
	@Column(name="id_ligacao")
	private Long idLigacao;

	@Temporal(TemporalType.DATE)
	@Column(name="data_servico")
	private Date dataServico;

	@Column(name="ddd_telefone_destino")
	private Integer dddTelefoneDestino;

	private String duracao;

	@Column(name="hora_qtd_chamada")
	private String horaQtdChamada;

	@Column(name="telefone_destino")
	private Integer telefoneDestino;

	@Column(name="telefone_origem")
	private Integer telefoneOrigem;

	@Column(name="valor_servico")
	private double valorServico;

	//bi-directional many-to-one association to TbFatura
	@ManyToOne
	@JoinColumn(name="id_fatura")
	private TbFatura tbFatura;

	//bi-directional many-to-one association to TbLinhaTelefonica
	@ManyToOne
	@JoinColumn(name="id_linha_telefonica")
	private TbLinhaTelefonica tbLinhaTelefonica;

	//bi-directional many-to-one association to TbServico
	@ManyToOne
	@JoinColumn(name="id_servico")
	private TbServico tbServico;

	public TbLigacao() {
	}
}