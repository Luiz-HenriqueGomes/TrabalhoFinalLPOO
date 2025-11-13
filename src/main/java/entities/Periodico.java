package entities;

public class Periodico extends DocFisico {
	private String area, subarea;
	
	public Periodico(String nome, String assunto, String descricao, String localizacao, String area, String subarea) {
		super(nome, assunto, descricao, localizacao);
		this.area = area;
		this.subarea = subarea;
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getSubarea() {
		return subarea;
	}
	public void setSubarea(String subarea) {
		this.subarea = subarea;
	}
	
	
}
