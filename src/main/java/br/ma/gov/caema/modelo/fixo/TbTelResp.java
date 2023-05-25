package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * The persistent class for the tb_tel_resp database table.
 * 
 */
@Entity
@Table(name="tb_tel_resp")
@NamedQuery(name="TbTelResp.findAll", query="SELECT t FROM TbTelResp t")
public class TbTelResp extends PanacheEntityBase{
	@Id
	@SequenceGenerator(name="TB_TEL_RESP_IDTELRESP_GENERATOR", sequenceName="$TB_ID_TEL_RESP_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_TEL_RESP_IDTELRESP_GENERATOR")
	@Column(name="id_tel_resp")
	private Long idTelResp;

	private String cargo;

	private String funcao;

	private String lotacao;

	private String matricula;

	private String nome;

	//bi-directional many-to-one association to TbLinhaTelefonica
	@ManyToOne
	@JoinColumn(name="id_linha_telefonica")
	private TbLinhaTelefonica tbLinhaTelefonica;

	//bi-directional many-to-one association to TbResponsavel
	@ManyToOne
	@JoinColumn(name="id_responsavel")
	private TbResponsavel tbResponsavel;

	public TbTelResp() {
	}
}