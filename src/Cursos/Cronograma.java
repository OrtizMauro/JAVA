package Cursos;

import java.util.ArrayList;

public class Cronograma {
    private int turno;
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    public Cronograma(){
    }

    public Cronograma(int turno) {
        this.turno = turno;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void agregarCurso(Curso c){
        listaCursos.add(c);

    }
    public void quitarCurso(Curso c){
        listaCursos.remove(c);
    }

}
