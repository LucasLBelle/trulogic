package trulogic.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name="Player")
public class Player {

	@Id
	@NotBlank
	@JsonProperty("name")
	@Column(name = "name")
	private String name;

	@NotBlank
	@JsonProperty("type")
	@Column(name = "type")
	private String type;

}
