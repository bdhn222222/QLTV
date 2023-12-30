package model.bean;

public class Reader {
	private Integer idReader;
	private String nameReader;
	private String identityy;
	private String telReader;
	public Integer getIdReader() {
		return idReader;
	}
	public void setIdReader(Integer idReader) {
		this.idReader = idReader;
	}
	public String getNameReader() {
		return nameReader;
	}
	public void setNameReader(String nameReader) {
		this.nameReader = nameReader;
	}
	public String getIdentityy() {
		return identityy;
	}
	public void setIdentityy(String identityy) {
		this.identityy = identityy;
	}
	public String getTelReader() {
		return telReader;
	}
	public void setTelReader(String telReader) {
		this.telReader = telReader;
	}
	public Reader(Integer idReader, String nameReader, String identityy, String telReader) {
		super();
		this.idReader = idReader;
		this.nameReader = nameReader;
		this.identityy = identityy;
		this.telReader = telReader;
	}
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
}
