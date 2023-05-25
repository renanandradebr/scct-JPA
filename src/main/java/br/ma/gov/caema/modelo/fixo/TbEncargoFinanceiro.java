package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_encargo_financeiro database table.
 * 
 */
@Entity
@Table(name="tb_encargo_financeiro")
@NamedQuery(name="TbEncargoFinanceiro.findAll", query="SELECT t FROM TbEncargoFinanceiro t")
public class TbEncargoFinanceiro extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_ENCARGO_FINANCEIRO_IDENCARGOFINANCEIRO_GENERATOR", sequenceName="$TB_ID_ENCARGO_FINANCEIRO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_ENCARGO_FINANCEIRO_IDENCARGOFINANCEIRO_GENERATOR")
	@Column(name="id_encargo_financeiro")
	private Long idEncargoFinanceiro;

	private Integer conta;

	private String contrato;

	@Column(name="descricao_contrato")
	private String descricaoContrato;

	@Column(name="valor_servico")
	private double valorServico;

	public TbEncargoFinanceiro() {
	}
}