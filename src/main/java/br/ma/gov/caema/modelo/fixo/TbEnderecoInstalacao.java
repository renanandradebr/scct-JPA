package br.ma.gov.caema.modelo.fixo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_endereco_instalacao database table.
 * 
 */
@Entity
@Table(name="tb_endereco_instalacao")
@NamedQuery(name="TbEnderecoInstalacao.findAll", query="SELECT t FROM TbEnderecoInstalacao t")
public class TbEnderecoInstalacao extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_ENDERECO_INSTALACAO_IDENDERECOINSTALACAO_GENERATOR", sequenceName="$TB_ID_ENDERECO_INSTALACAO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_ENDERECO_INSTALACAO_IDENDERECOINSTALACAO_GENERATOR")
	@Column(name="id_endereco_instalacao")
	private Long idEnderecoInstalacao;

	private String bairro;

	private String cep;

	@Column(name="nome_logradouro")
	private String nomeLogradouro;

	@Column(name="num_imovel")
	private Integer numImovel;

	@Column(name="tipo_logradouro")
	private String tipoLogradouro;

	//bi-directional many-to-one association to TbLocalidade
	@ManyToOne
	@JoinColumn(name="id_localidade")
	private TbLocalidade tbLocalidade;

	//bi-directional many-to-one association to TbLinhaTelefonica
	@OneToMany(mappedBy="tbEnderecoInstalacao")
	private List<TbLinhaTelefonica> tbLinhaTelefonicas;

	public TbEnderecoInstalacao() {
	}

	

}