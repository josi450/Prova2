public class Professor extends Servidor{
private Servidor coordEnsino;


public Professor(String n, Servidor ce){
super(n);
this.setCoordEnsino(ce);
}
public String getCoordEnsino(){
return this.coordEnsino;
}
public void setCoordEnsino(Servidor ce){
    this.coordEnsino=ce;
}
}
