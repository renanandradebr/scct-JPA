package br.ma.gov.caema.modelo.segurança;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import lombok.Data;

/**
 * The persistent class for the tb_log database table.
 * 
 */
@Entity
@Table(name="tb_log")
@NamedQuery(name="TbLog.findAll", query="SELECT t FROM TbLog t")
public class TbLog extends  PanacheEntityBase{
	@Id
	@SequenceGenerator(name="TB_LOG_IDLOG_GENERATOR", sequenceName="$TB_ID_LOG_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_LOG_IDLOG_GENERATOR")
	@Column(name="id_log")
	private Long idLog;

	@Column(name="data_loggin")
	private Timestamp dataLoggin;

	//bi-directional many-to-one association to TbUsuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private TbUsuario tbUsuario;

	public TbLog() {
	}

}