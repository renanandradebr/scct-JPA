package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_status database table.
 * 
 */
@Entity
@Table(name="tb_status")
@NamedQuery(name="TbStatus.findAll", query="SELECT t FROM TbStatus t")
public class TbStatus extends  PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_STATUS_IDSTATUS_GENERATOR", sequenceName="TB_STATUS_ID_STATUS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_STATUS_IDSTATUS_GENERATOR")
	@Column(name="id_status")
	private Long idStatus;

	private String descricao;

	//bi-directional many-to-one association to TbStatusAparelho
	@OneToMany(mappedBy="tbStatus")
	private List<TbStatusAparelho> tbStatusAparelhos;

	//bi-directional many-to-one association to TbStatusChipTelefonico
	@OneToMany(mappedBy="tbStatus")
	private List<TbStatusChipTelefonico> tbStatusChipTelefonicos;

	public TbStatus() {
	}

}