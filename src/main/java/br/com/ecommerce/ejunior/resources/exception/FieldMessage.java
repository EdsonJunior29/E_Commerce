package br.com.ecommerce.ejunior.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable{
	private static final long serialVersionUID = 1L;

	private String fieldName;
	private String message;
	
	public FieldMessage() {}

	public FieldMessage(String fieldName, String fieldMessage) {
		super();
		this.fieldName = fieldName;
		this.message = fieldMessage;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldMessage() {
		return message;
	}

	public void setFieldMessage(String fieldMessage) {
		this.message = fieldMessage;
	}
	
}
