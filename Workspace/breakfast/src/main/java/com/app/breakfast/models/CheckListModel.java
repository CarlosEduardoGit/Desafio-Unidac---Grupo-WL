package com.app.breakfast.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_CHECKLISTS")
public class CheckListModel implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	//@JsonProperty("_id")
	private UUID checkListId;
	
	@Column(nullable = false, unique = true, length = 100)
	private String collaboratorName;
	
	@Column
	private boolean collaboratorContributed;
	
	@Column(nullable = false, unique = true, length = 11)
	private String cpf;
	
	@Column(nullable = false, unique = true, length = 100)
	private String contribution;
	
	@Column(nullable = false, length = 10)
	private String dataBreakfast;

}
