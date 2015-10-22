package org.jsoup;

import org.jsoup.nodes.Document;

public class EntitiesEscapeInputs {
	private StringBuilder accum;
	private String string;
	private Document.OutputSettings out;
	private boolean inAttribute, normaliseWhite, stripLeadingWhite;
	
	public EntitiesEscapeInputs(){
		
	}

	public StringBuilder getAccum() {
		return accum;
	}

	public String getString() {
		return string;
	}

	public Document.OutputSettings getOut() {
		return out;
	}

	public boolean isInAttribute() {
		return inAttribute;
	}

	public boolean isNormaliseWhite() {
		return normaliseWhite;
	}

	public boolean isStripLeadingWhite() {
		return stripLeadingWhite;
	}

	public void setAccum(StringBuilder accum) {
		this.accum = accum;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void setOut(Document.OutputSettings out) {
		this.out = out;
	}

	public void setInAttribute(boolean inAttribute) {
		this.inAttribute = inAttribute;
	}

	public void setNormaliseWhite(boolean normaliseWhite) {
		this.normaliseWhite = normaliseWhite;
	}

	public void setStripLeadingWhite(boolean stripLeadingWhite) {
		this.stripLeadingWhite = stripLeadingWhite;
	}
}
