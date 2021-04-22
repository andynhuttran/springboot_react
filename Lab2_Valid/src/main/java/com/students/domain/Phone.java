/**
 * 
 */
package com.students.domain;

import com.students.validators.USPhone;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author B.Pirasanth
 *
 */

@USPhone
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


 	private Integer area;
 	private Integer prefix;
 	private Integer number;
	

 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"area=" + area +
				", prefix=" + prefix +
				", number=" + number +
				'}';
	}
}
