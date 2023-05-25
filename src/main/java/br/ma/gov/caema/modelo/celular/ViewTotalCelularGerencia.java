package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the view_total_celular_gerencia database table.
 * 
 */
@Entity
@Table(name="view_total_celular_gerencia")
@NamedQuery(name="ViewTotalCelularGerencia.findAll", query="SELECT v FROM ViewTotalCelularGerencia v")
public class ViewTotalCelularGerencia extends PanacheEntityBase{

	@Column(name="ano_referencia")
	private String anoReferencia;

	@Column(name="cod_gerencia")
	private String codGerencia;

	@Column(name="custo_despesas_saida")
	private String custoDespesasSaida;

	@Column(name="desc_gerencia")
	private String descGerencia;

	private Long id;

	@Column(name="mes_referencia")
	private String mesReferencia;

	@Column(name="valor_total")
	private double valorTotal;

	public ViewTotalCelularGerencia() {
	}
}