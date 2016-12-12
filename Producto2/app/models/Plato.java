package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Plato extends Model {


	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Constraints.Required
	public String nombre;

	@Constraints.Required
	public String ingredientes;

	@Constraints.Required
	public String descripcion;
	
	@Constraints.Required
	public String precio;
	/**
	 * Generic query helper for entity Computer with id Long
	 */
	public static Find<Long, Plato> find = new Find<Long, Plato>() {
	};



}
