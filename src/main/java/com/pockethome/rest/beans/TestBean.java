package com.pockethome.rest.beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "id", "name" })
public class TestBean {

	private String m_id;
	private String m_name;

	public TestBean() {

	}

	public TestBean(String id, String name) {
		m_id = id;
		m_name = name;
	}

	@XmlAttribute
	public String getId() {
		return m_id;
	}

	@XmlAttribute
	public String getName() {
		return m_name;
	}

}
