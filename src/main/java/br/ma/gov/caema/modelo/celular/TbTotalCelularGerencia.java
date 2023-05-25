package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_total_celular_gerencia database table.
 * 
 */
@Entity
@Table(name="tb_total_celular_gerencia")
@NamedQuery(name="TbTotalCelularGerencia.findAll", query="SELECT t FROM TbTotalCelularGerencia t")
public class TbTotalCelularGerencia extends  PanacheEntityBase{

	@Column(name="cod_gerencia")
	private String codGerencia;

	@Column(name="desc_gerencia")
	private String descGerencia;

	private Long id;

	@Column(name="mes_ano")
	private Integer mesAno;

	private double total;

	public TbTotalCelularGerencia() {
	}
}