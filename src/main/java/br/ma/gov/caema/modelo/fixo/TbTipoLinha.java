package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_tipo_linha database table.
 * 
 */
@Entity
@Table(name="tb_tipo_linha")
@NamedQuery(name="TbTipoLinha.findAll", query="SELECT t FROM TbTipoLinha t")
public class TbTipoLinha extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_TIPO_LINHA_IDTIPOLINHA_GENERATOR", sequenceName="$TB_ID_TIPO_LINHA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_TIPO_LINHA_IDTIPOLINHA_GENERATOR")
	@Column(name="id_tipo_linha")
	private Long idTipoLinha;

	@Column(name="prod_linha")
	private String prodLinha;

	//bi-directional many-to-one association to TbLinhaTelefonica
	@OneToMany(mappedBy="tbTipoLinha")
	private List<TbLinhaTelefonica> tbLinhaTelefonicas;

	public TbTipoLinha() {
	}
}