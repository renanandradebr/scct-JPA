package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the vw_agenda_telefonica_fixo database table.
 * 
 */
@Entity
@Table(name="vw_agenda_telefonica_fixo")
@NamedQuery(name="VwAgendaTelefonicaFixo.findAll", query="SELECT v FROM VwAgendaTelefonicaFixo v")
public class VwAgendaTelefonicaFixo extends PanacheEntityBase{

	private String departamento;

	private String especificacao;

	private Long id;

	private String ramal;

	private String regiao;

	public VwAgendaTelefonicaFixo() {
	}
}