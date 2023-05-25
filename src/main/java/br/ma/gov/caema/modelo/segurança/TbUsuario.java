package br.ma.gov.caema.modelo.segurança;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_usuario database table.
 * 
 */
@Entity
@Table(name="tb_usuario")
@NamedQuery(name="TbUsuario.findAll", query="SELECT t FROM TbUsuario t")
public class TbUsuario extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_USUARIO_IDUSUARIO_GENERATOR", sequenceName="$TB_ID_USUARIO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_USUARIO_IDUSUARIO_GENERATOR")
	@Column(name="id_usuario")
	private Long idUsuario;

	private Boolean ativo;

	private String cargo;

	private String email;

	private String lotacao;

	private String matricula;

	private String nome;

	private String perfil;

	@Column(name="primeiro_acesso")
	private Boolean primeiroAcesso;

	private String senha;

	private String usuario;

	//bi-directional many-to-one association to TbLog
	@OneToMany(mappedBy="tbUsuario")
	private List<TbLog> tbLogs;

	public TbUsuario() {
	}
}