package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_total_celular_gerencia_detalhado database table.
 * 
 */
@Entity
@Table(name="tb_total_celular_gerencia_detalhado")
@NamedQuery(name="TbTotalCelularGerenciaDetalhado.findAll", query="SELECT t FROM TbTotalCelularGerenciaDetalhado t")
public class TbTotalCelularGerenciaDetalhado extends  PanacheEntityBase{

	@Column(name="cod_gerencia")
	private String codGerencia;

	private Integer ddd;

	@Column(name="desc_gerencia")
	private String descGerencia;

	private Long id;

	private String matricula;

	@Column(name="mes_ano")
	private Integer mesAno;

	private String nome;

	private Integer numero;

	private double valor;

	public TbTotalCelularGerenciaDetalhado() {
	}
}