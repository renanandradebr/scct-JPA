package br.ma.gov.caema.modelo.celular;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import lombok.Data;

/**
 * The persistent class for the tb_chip_telefonico database table.
 * 
 */
@Entity
@Table(name="tb_chip_telefonico")
@NamedQuery(name="TbChipTelefonico.findAll", query="SELECT t FROM TbChipTelefonico t")
public class TbChipTelefonico extends PanacheEntityBase{

	@Id
	@SequenceGenerator(name="TB_CHIP_TELEFONICO_IDCHIPTELEFONICO_GENERATOR", sequenceName="TB_CHIP_TELEFONICO_ID_CHIP_TELEFONICO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CHIP_TELEFONICO_IDCHIPTELEFONICO_GENERATOR")
	@Column(name="id_chip_telefonico")
	private Long idChipTelefonico;

	@Column(name="aparece_agenda")
	private Boolean apareceAgenda;

	private Integer ddd;

	private Boolean modem;

	private Integer numero;

	private String observacao;

	@Column(name="possui_dados")
	private Boolean possuiDados;

	@Column(name="qtd_minutos")
	private Integer qtdMinutos;

	@Column(name="valor_credito")
	private double valorCredito;

	//bi-directional many-to-one association to TbEmpregado
	@ManyToOne
	@JoinColumn(name="id_empregado")
	private TbEmpregado tbEmpregado;

	//bi-directional many-to-one association to TbLote
	@ManyToOne
	@JoinColumn(name="id_lote")
	private TbLote tbLote;

	//bi-directional many-to-one association to TbChipTelefonicoConta
	@OneToMany(mappedBy="tbChipTelefonico")
	private List<TbChipTelefonicoConta> tbChipTelefonicoContas;

	//bi-directional many-to-one association to TbStatusChipTelefonico
	@OneToMany(mappedBy="tbChipTelefonico")
	private List<TbStatusChipTelefonico> tbStatusChipTelefonicos;

	public TbChipTelefonico() {
	}


}