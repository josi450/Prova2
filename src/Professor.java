public class Professor extends Servidor{
private String coordEnsino;


public Professor(String n, String ce){
super(n);
this.setCoordEnsino(ce);
}
public String getCoordEnsino(){
return this.coordEnsino;
}
public void setCoordEnsino(String ce){
    this.coordEnsino=ce;
}
}