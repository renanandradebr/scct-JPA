package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_fatura database table.
 * 
 */
@Entity
@Table(name="tb_fatura")
@NamedQuery(name="TbFatura.findAll", query="SELECT t FROM TbFatura t")
public class TbFatura extends PanacheEntityBase{
	@Id
	@SequenceGenerator(name="TB_FATURA_IDFATURA_GENERATOR", sequenceName="$TB_ID_FATURA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_FATURA_IDFATURA_GENERATOR")
	@Column(name="id_fatura")
	private Long idFatura;

	@Column(name="mes_ano")
	private Integer mesAno;

	//bi-directional many-to-one association to TbLigacao
	@OneToMany(mappedBy="tbFatura")
	private List<TbLigacao> tbLigacaos;

	public TbFatura() {
	}

}