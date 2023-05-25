package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_lote database table.
 * 
 */
@Entity
@Table(name="tb_lote")
@NamedQuery(name="TbLote.findAll", query="SELECT t FROM TbLote t")
public class TbLote extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_LOTE_IDLOTE_GENERATOR", sequenceName="TB_LOTE_ID_LOTE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_LOTE_IDLOTE_GENERATOR")
	@Column(name="id_lote")
	private Long idLote;

	private String descricao;

	//bi-directional many-to-one association to TbChipTelefonico
	@OneToMany(mappedBy="tbLote")
	private List<TbChipTelefonico> tbChipTelefonicos;

	public TbLote() {
	}

}