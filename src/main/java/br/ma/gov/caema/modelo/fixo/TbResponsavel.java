package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_responsavel database table.
 * 
 */
@Entity
@Table(name="tb_responsavel")
@NamedQuery(name="TbResponsavel.findAll", query="SELECT t FROM TbResponsavel t")
public class TbResponsavel extends PanacheEntityBase{
	@Id
	@SequenceGenerator(name="TB_RESPONSAVEL_IDRESPONSAVEL_GENERATOR", sequenceName="$TB_ID_RESPONSAVEL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_RESPONSAVEL_IDRESPONSAVEL_GENERATOR")
	@Column(name="id_responsavel")
	private Long idResponsavel;

	private String matricula;

	//bi-directional many-to-one association to TbTelResp
	@OneToMany(mappedBy="tbResponsavel")
	private List<TbTelResp> tbTelResps;

	public TbResponsavel() {
	}
}