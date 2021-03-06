package jnode.dto;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * 
 * @author kreon
 * 
 */
@DatabaseTable(tableName = "echoarea")
public class Echoarea {
	@DatabaseField(columnName = "id", generatedId = true)
	private Long id;
	@DatabaseField(columnName = "name", canBeNull = false, uniqueIndex = true)
	private String name;
	@DatabaseField(columnName = "description", dataType = DataType.LONG_STRING)
	private String description;
	@DatabaseField(columnName = "wlevel", canBeNull = false, defaultValue = "0")
	private Long writelevel;
	@DatabaseField(columnName = "rlevel", canBeNull = false, defaultValue = "0")
	private Long readlevel;
	@DatabaseField(columnName = "grp", canBeNull = false, defaultValue = "")
	private String group;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getWritelevel() {
		return writelevel;
	}

	public void setWritelevel(Long writelevel) {
		this.writelevel = writelevel;
	}

	public Long getReadlevel() {
		return readlevel;
	}

	public void setReadlevel(Long readlevel) {
		this.readlevel = readlevel;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Echoarea other = (Echoarea) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
