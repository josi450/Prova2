public class AssisAdm extends Servidor{
private String nomeSetor;

public AssisAdm (String n, String ns){
super(n);
this.setNomeSetor(ns);
}
public String getNomeSetor(){
	return this.nomeSetor;
}
public void setNomeSetor(String ns){
	this.nomeSetor=ns;
}
}
